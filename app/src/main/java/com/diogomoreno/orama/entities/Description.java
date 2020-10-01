package com.diogomoreno.orama.entities;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class Description extends RealmObject {
    String objective;
    @SerializedName("movie_url")
    String movieUrl;

    @SerializedName("target_audience")
    String targetAudience;

    @SerializedName("strengths")
    String strengths;

    String strategy;

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getStrengths() {
        return strengths;
    }

    public void setStrengths(String strengths) {
        this.strengths = strengths;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
}
