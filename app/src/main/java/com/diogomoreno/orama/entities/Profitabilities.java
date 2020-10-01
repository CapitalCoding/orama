package com.diogomoreno.orama.entities;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Profitabilities extends RealmObject {

    @SerializedName("m60")
    double sixtyMonths;
    @SerializedName("m48")
    double fortyEightMonths;
    @SerializedName("m24")
    double twentyFourMonths;

    double month;
    @SerializedName("m12")
    double twelveMonths;

    double year;
    double day;

    public double getSixtyMonths() {
        return sixtyMonths;
    }

    public void setSixtyMonths(double sixtyMonths) {
        this.sixtyMonths = sixtyMonths;
    }

    public double getFortyEightMonths() {
        return fortyEightMonths;
    }

    public void setFortyEightMonths(double fortyEightMonths) {
        this.fortyEightMonths = fortyEightMonths;
    }

    public double getTwentyFourMonths() {
        return twentyFourMonths;
    }

    public void setTwentyFourMonths(double twentyFourMonths) {
        this.twentyFourMonths = twentyFourMonths;
    }

    public double getMonth() {
        return month;
    }

    public void setMonth(double month) {
        this.month = month;
    }

    public double getTwelveMonths() {
        return twelveMonths;
    }

    public void setTwelveMonths(double twelveMonths) {
        this.twelveMonths = twelveMonths;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }
}
