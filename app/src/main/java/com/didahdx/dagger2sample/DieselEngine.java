package com.didahdx.dagger2sample;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";

    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "start: diesel engine started");
    }

    @Override
    public void stop() {
        Log.d(TAG, "stop: diesel engine stopped");
    }
}
