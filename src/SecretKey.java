import java.math.BigInteger;

public class SecretKey {
    private BigInteger d;
    private BigInteger q;
    private BigInteger p;

    public SecretKey(BigInteger d, BigInteger q, BigInteger p) {
        this.d = d;
        this.q = q;
        this.p = p;
    }

    public BigInteger getD() {
        return d;
    }

    public BigInteger getQ() {
        return q;
    }

    public BigInteger getP() {
        return p;
    }
}
