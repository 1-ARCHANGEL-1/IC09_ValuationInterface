import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Objects;

public abstract class Security implements Comparable<Security>, Valuation
{
    protected String mISIN;
    protected String mIssuer;
    protected NumberFormat currency = NumberFormat.getCurrencyInstance();
    protected DecimalFormat twoDp = new DecimalFormat(" 0.00");

    protected Security(String ISIN, String issuer)
    {
        mISIN = ISIN;
        mIssuer = issuer;
    }

    public String getISIN()
    {
        return mISIN;
    }

    public void setISIN(String ISIN)
    {
        mISIN = ISIN;
    }

    public String getIssuer()
    {
        return mIssuer;
    }

    public void setIssuer(String issuer)
    {
        mIssuer = issuer;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Security security = (Security) o;
        return Objects.equals(mISIN, security.mISIN) && Objects.equals(mIssuer, security.mIssuer);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(mISIN, mIssuer);
    }
}
