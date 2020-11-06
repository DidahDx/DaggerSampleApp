package com.didahdx.dagger2sample.di.modules;


import com.didahdx.dagger2sample.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    @Provides
    @Singleton
    static Driver providesDriver(){
        return new Driver();
    }

}
