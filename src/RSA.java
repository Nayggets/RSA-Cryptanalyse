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

    public static BigInteger dechiffrementRsa(BigInteger c,BigInteger d, BigInteger N){
        return c.modPow(d,N);
    }

    public static BigInteger chiffrementRsa(BigInteger m,BigInteger e,BigInteger n){
        return m.modPow(e,n);
    }

    public SecretKey getSecretKey() {
        return secretKey;
    }




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



}
