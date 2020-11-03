package com.didahdx.dagger2sample;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    Engine engine;
    Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "drive: ");
    }

    //method injection
    @Inject
    public void enableRemote(Remote remote) {
        remote.setRemoteListener(this);
    }


}
