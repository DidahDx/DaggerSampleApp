package com.didahdx.dagger2sample.car;

import android.util.Log;

import com.didahdx.dagger2sample.di.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";
    Engine engine;
    Wheels wheels;
    Driver driver;

    @Inject
    public Car(Driver driver,Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver=driver;
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver+" drive: "+this);
    }

    //method injection
    @Inject
    public void enableRemote(Remote remote) {
        remote.setRemoteListener(this);
    }


}
