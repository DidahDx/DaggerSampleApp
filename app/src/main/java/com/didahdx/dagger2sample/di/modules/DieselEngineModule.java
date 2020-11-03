package com.didahdx.dagger2sample.di.modules;

import com.didahdx.dagger2sample.DieselEngine;
import com.didahdx.dagger2sample.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine providesDieselEngine() {
        return new DieselEngine(horsePower);
    }
}
