import java.math.BigInteger;

public class PublicKey {
    private BigInteger e;
    private BigInteger N;

    public PublicKey(BigInteger e, BigInteger n) {
        this.e = e;
        this.N = n;
    }


    public BigInteger getE() {
        return e;
    }

    public BigInteger getN() {
        return N;
    }
}
