package com.didahdx.dagger2sample.di.modules;

import com.didahdx.dagger2sample.car.DieselEngine;
import com.didahdx.dagger2sample.car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int providesHorsePower(){
        return horsePower;
    }

    @Provides
    Engine providesDieselEngine(DieselEngine engine) {
        return engine;
    }
}
