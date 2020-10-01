package com.diogomoreno.orama;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class OramaApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder()
                .name("orama.realm")
                .build();


        Realm.setDefaultConfiguration(config);
    }
}
