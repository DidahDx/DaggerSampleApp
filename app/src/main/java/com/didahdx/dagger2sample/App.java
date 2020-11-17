package com.didahdx.dagger2sample;

import android.app.Application;

import com.didahdx.dagger2sample.di.components.AppComponent;
import com.didahdx.dagger2sample.di.components.DaggerAppComponent;
import com.didahdx.dagger2sample.di.modules.DriverModule;


public class App extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.factory().create(new DriverModule("Dx"));
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
