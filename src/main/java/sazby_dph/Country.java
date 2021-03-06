package sazby_dph;

import java.util.Objects;

public class Country {

    private String _comment;
    private String iso_duplicated;
    private String country;
    private double standard_rate;
    private double reduced_rate;
    private String reduced_rate_alt;
    private String super_reduced_rate;
    private double parking_rate;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getStandard_rate() {
        return standard_rate;
    }

    public void setStandard_rate(double standard_rate) {
        this.standard_rate = standard_rate;
    }

    public double getReduced_rate() {
        return reduced_rate;
    }

    public void setReduced_rate(double reduced_rate) {
        this.reduced_rate = reduced_rate;
    }

    public String getReduced_rate_alt() {
        return reduced_rate_alt;
    }

    public void setReduced_rate_alt(String reduced_rate_alt) {
        this.reduced_rate_alt = reduced_rate_alt;
    }

    public String isSuper_reduced_rate() {
        return super_reduced_rate;
    }

    public void setSuper_reduced_rate(String super_reduced_rate) {
        this.super_reduced_rate = super_reduced_rate;
    }

    public double getParking_rate() {
        return parking_rate;
    }

    public void setParking_rate(double parking_rate) {
        this.parking_rate = parking_rate;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + country + '\'' +
                ", standardRate=" + standard_rate +
                ", reducedRate=" + reduced_rate +
                ", reducedAltRate=" + reduced_rate_alt +
                ", superReducedRate=" + super_reduced_rate +
                ", parkingRate=" + parking_rate +
                '}';
    }
}
