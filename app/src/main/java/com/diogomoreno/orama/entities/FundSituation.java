package com.diogomoreno.orama.entities;

import io.realm.RealmObject;

public class FundSituation extends RealmObject {
    String code;
    String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
