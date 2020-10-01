package com.diogomoreno.orama.handler;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class RealmHandler {

    static RealmHandler instance;


    public RealmHandler() {
    }

    public static RealmHandler singleton() {
        if(instance == null)
            instance = new RealmHandler();
        return instance;
    }

    public Realm getRealmInstance(){
        return Realm.getDefaultInstance();
    }
}
