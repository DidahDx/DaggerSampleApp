package com.didahdx.dagger2sample;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "start: petrol engine started");
    }

    @Override
    public void stop() {
        Log.d(TAG, "stop: petrol engine stopped");
    }
}
