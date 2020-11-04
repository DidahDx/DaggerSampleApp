package com.didahdx.dagger2sample.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";
    int horsePower;
    int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horse power") int horsePower,@Named("engine capacity") int engineCapacity) {
        this.horsePower=horsePower;
        this.engineCapacity=engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: petrol engine started. HorsePower "+horsePower+
                "\n engineCapacity "+engineCapacity);
    }

    @Override
    public void stop() {
        Log.d(TAG, "stop: petrol engine stopped");
    }
}
