package com.didahdx.dagger2sample.di.modules;

import com.didahdx.dagger2sample.Rims;
import com.didahdx.dagger2sample.Tire;
import com.didahdx.dagger2sample.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims providesRims() {
        return new Rims();
    }

    @Provides
    static Tire providesTires() {
        Tire tire = new Tire();
        tire.inflate();
        return tire;
    }

    @Provides
    static Wheels providesWheels(Rims rims, Tire tire) {
        return new Wheels(rims, tire);
    }
}
