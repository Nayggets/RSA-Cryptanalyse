import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA {

    private PublicKey publicKey;
    private SecretKey secretKey;

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public RSA(int bit){
        SecureRandom secureRandom = new SecureRandom();
        BigInteger premier = BigInteger.probablePrime(bit/2,secureRandom);
        while(!premier.isProbablePrime(1000000)){
            premier = BigInteger.probablePrime(bit/2,secureRandom);
        }
        BigInteger secondPremier = BigInteger.probablePrime(bit/2,secureRandom);
        while(!secondPremier.isProbablePrime(1000000)){
            secondPremier = BigInteger.probablePrime(bit/2,secureRandom);
        }
        BigInteger N = premier.multiply(secondPremier);
        BigInteger phi = getPhi(premier,secondPremier);
        BigInteger e = getE(phi,bit);
        BigInteger d = euclideEtendu(e,phi)[1];
        publicKey = new PublicKey(e,N);
        secretKey = new SecretKey(d,premier,secondPremier);
    }


    public static BigInteger getPhi(BigInteger p, BigInteger q) {
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        return phi;
    }
    public static BigInteger gcd(BigInteger a, BigInteger b) {
        if (b.equals(BigInteger.ZERO)) {
            return a;
        } else {
            return gcd(b, a.mod(b));
        }
    }

    public static BigInteger getE(BigInteger phi,int bit) {
        SecureRandom rand = new SecureRandom();
        BigInteger e = new BigInteger(bit, rand);
        do {
            e = new BigInteger(bit, rand);
            while (e.min(phi).equals(phi)) { // while phi is smaller than e, look for a new e
                e = new BigInteger(bit, rand);
            }
        } while (!gcd(e, phi).equals(BigInteger.ONE)); // if gcd(e,phi) isnt 1 then stay in loop
        return e;
    }
    public BigInteger chiffrementRSA(BigInteger m){
        return m.modPow(publicKey.getE(),publicKey.getN());
    }

    public BigInteger dechiffrementRsa(BigInteger c){
        return c.modPow(secretKey.getD(),secretKey.getP().multiply(secretKey.getQ()));
    }

    public BigInteger dechiffrementRsa(BigInteger c,BigInteger d, BigInteger N){
        return c.modPow(d,N);
    }
    /*
    def keyGenRSA(bit : int ) -> tuple[tuple[int,int], int]:
        premiers = deuxGrandPremier(bit)
        n = premiers[0] * premiers[1]
        phi = (premiers[0]-1)*(premiers[1]-1)
        e = random.randint(1,phi)
        while Euclide(e,phi) != 1:
            e = random.randint(1,phi)
        d = Euclide_Etendu(e,phi)[1]
        while d < 0:
            e = random.randint(1, phi)
            while Euclide(e, phi) != 1:
                e = random.randint(1, phi)
            d = Euclide_Etendu(e, phi)[1]

        return (n,e),(d)


def chiffrementRSA(m : int, publicKey : tuple[int,int]) -> int:
    return exponentiation_modulaire(m,publicKey[1],publicKey[0])

def dechiffrementRSA(c : int , privatekey : tuple[int,int]):
    return exponentiation_modulaire(c,privatekey[1],privatekey[0])

     */


    public static BigInteger euclide(BigInteger a, BigInteger b) {
        if(b.equals(BigInteger.ZERO)) {
            return a;
        } else {
            return euclide(b, a.mod(b));
        }
    }

    public static BigInteger[] euclideEtendu(BigInteger a, BigInteger b) {
        BigInteger[] result = new BigInteger[3];
        if (b.equals(BigInteger.ZERO)) {
            result[0] = a;
            result[1] = BigInteger.ONE;
            result[2] = BigInteger.ZERO;
            return result;
        } else {
            result = euclideEtendu(b, a.mod(b));
            BigInteger temp = result[1].subtract(a.divide(b).multiply(result[2]));
            result[1] = result[2];
            result[2] = temp;
            return result;
        }
    }

    public static BigInteger exponentiationModulaire(BigInteger a, BigInteger b, BigInteger n) {
        BigInteger result = BigInteger.ONE;
        while (b.compareTo(BigInteger.ZERO) > 0) {
            if (b.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
                result = result.multiply(a).mod(n);
            }
            a = a.multiply(a).mod(n);
            b = b.divide(BigInteger.valueOf(2));
        }
        return result;
    }

    public static BigInteger[] generateClePublique(BigInteger p, BigInteger q) {
        BigInteger n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        BigInteger e = BigInteger.valueOf(2);
        while (e.compareTo(phi) < 0) {
            if (euclide(e, phi).equals(BigInteger.ONE)) {
                break;
            } else {
                e = e.add(BigInteger.ONE);
            }
        }
        BigInteger[] clePublique = {e, n};
        return clePublique;
    }

    public static BigInteger[] generateClePrivee(BigInteger p, BigInteger q, BigInteger e) {
        BigInteger n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        BigInteger[] result = euclideEtendu(e, phi);
        BigInteger d = result[1];
        if (d.compareTo(BigInteger.ZERO) < 0) {
            d = d.add(phi);
        }
        BigInteger[] clePrivee = {d, n};
        return clePrivee;
    }

    public static BigInteger[] chiffrement(BigInteger[] clePublique, BigInteger[] message) {
        BigInteger[] chiffre = new BigInteger[message.length];
        for (int i = 0; i < message.length; i++) {
            chiffre[i] = exponentiationModulaire(message[i], clePublique[0], clePublique[1]);
        }
        return chiffre;
    }

    public static BigInteger[] dechiffrement(BigInteger[] clePrivee, BigInteger[] chiffre) {
        BigInteger[] message = new BigInteger[chiffre.length];
        for (int i = 0; i < chiffre.length; i++) {
            message[i] = exponentiationModulaire(chiffre[i], clePrivee[0], clePrivee[1]);
        }
        return message;
    }
}
