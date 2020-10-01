package com.diogomoreno.orama.entities.specification;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class FundMacroStrategy extends RealmObject {
    String explanation;
    @PrimaryKey
    long id;
    String name;

    public FundMacroStrategy() {
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
