package com.didahdx.dagger2sample.car;

import android.util.Log;

import javax.inject.Inject;


public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";
    int horsePower;

    @Inject
    public DieselEngine(int horsePower) {
    this.horsePower=horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: diesel engine started horse power is "+horsePower);
    }

    @Override
    public void stop() {
        Log.d(TAG, "stop: diesel engine stopped");
    }
}
