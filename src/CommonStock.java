import java.util.Objects;

public class CommonStock extends Security implements Comparable<Security>, Valuation
{
    private int mShares;
    private double mPurchasePrice;
    private double mCurrentPrice;



    public CommonStock(String ISIN, String issuer, int mshares, double purchasePrice, double currentPrice)
    {
        super(ISIN, issuer);
        this.mShares = mshares;
        mPurchasePrice = purchasePrice;
        mCurrentPrice = currentPrice;
    }

    public int getMshares() {
        return mShares;
    }

    public void setMshares(int mshares) {
        this.mShares = mshares;
    }

    public double getPurchasePrice() {
        return mPurchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        mPurchasePrice = purchasePrice;
    }

    public double getCurrentPrice() {
        return mCurrentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        mCurrentPrice = currentPrice;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommonStock that = (CommonStock) o;
        return mShares == that.mShares && Double.compare(that.mPurchasePrice, mPurchasePrice) == 0 && Double.compare(that.mCurrentPrice, mCurrentPrice) == 0;
    }


    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), mShares, mPurchasePrice, mCurrentPrice);
    }

    @Override
    public String toString()
    {
        return "CommonStock[" +"mISIN = '" + mISIN + '\'' +
                ", mIssuer ='" + mIssuer + '\'' + ", " + currency.format(mPurchasePrice)+ ", mPurchasePrice = "+ mPurchasePrice +
                ", mCurrentPrice = " +currency.format(mCurrentPrice) +
                ", mshares = " + mShares +","+ " Total return =  "+ currency.format(totalReturn())+","+ " Percent Return = " +currency.format(percentReturn())+
                ']';
    }

    @Override
    public double totalReturn()
    {
        return (mCurrentPrice- mPurchasePrice) * mShares;
    }

    @Override
    public double percentReturn()
    {
        return ((mCurrentPrice- mPurchasePrice)/mPurchasePrice)  * 100.0;
    }

    @Override
    public int compareTo(Security o) {
        return 0;
    }
}
