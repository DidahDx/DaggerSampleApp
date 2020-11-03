package com.didahdx.dagger2sample;

import android.util.Log;



public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";
    int horsePower;

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
