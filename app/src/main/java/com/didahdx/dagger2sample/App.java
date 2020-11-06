package com.didahdx.dagger2sample;

import android.app.Application;

import com.didahdx.dagger2sample.di.components.AppComponent;
import com.didahdx.dagger2sample.di.components.DaggerAppComponent;


public class App extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
