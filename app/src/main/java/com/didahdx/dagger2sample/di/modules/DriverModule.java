package com.didahdx.dagger2sample.di.modules;


import com.didahdx.dagger2sample.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {
    private String driverName;

    public DriverModule(String driverName) {
        this.driverName = driverName;
    }

    @Provides
    @Singleton
    Driver providesDriver(){
        return new Driver(driverName);
    }

}
