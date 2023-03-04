package Jason;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class CurrencyRate {
    @SerializedName("currencyCodeA")
    private int from;

    @SerializedName("currencyCodeB")
    private int to;

    private BigDecimal rateBuy;
    private BigDecimal rateCross;

    private BigDecimal rateSell;

    public CurrencyRate() {
    }

    public CurrencyRate(int from, int to, BigDecimal rateBuy, BigDecimal rateCross, BigDecimal rateSell) {
        this.from = from;
        this.to = to;
        this.rateBuy = rateBuy;
        this.rateCross = rateCross;
        this.rateSell = rateSell;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public BigDecimal getRateBuy() {
        return rateBuy;
    }

    public void setRateBuy(BigDecimal rateBuy) {
        this.rateBuy = rateBuy;
    }

    public BigDecimal getRateCross() {
        return rateCross;
    }

    public void setRateCross(BigDecimal rateCross) {
        this.rateCross = rateCross;
    }

    public BigDecimal getRateSell() {
        return rateSell;
    }

    public void setRateSell(BigDecimal rateSell) {
        this.rateSell = rateSell;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "from=" + from +
                ", to=" + to +
                ", rateBuy=" + rateBuy +
                ", rateCross=" + rateCross +
                ", rateSell=" + rateSell +
                '}';
    }
}
