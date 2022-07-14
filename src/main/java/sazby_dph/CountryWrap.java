package sazby_dph;

public class CountryWrap {
    private String last_updated;
    private String disclaimer;
    private Country rates;

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public Country getRates() {
        return rates;
    }

    public void setRates(Country rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "CountryWrap{" +
                "lastUpdated='" + last_updated + '\'' +
                ", disclaimer='" + disclaimer + '\'' +
                ", rates='" + rates + '\'' +
                '}';
    }
}
