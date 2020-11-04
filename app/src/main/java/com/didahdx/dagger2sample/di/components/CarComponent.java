package com.didahdx.dagger2sample.di.components;

import com.didahdx.dagger2sample.car.Car;
import com.didahdx.dagger2sample.MainActivity;
import com.didahdx.dagger2sample.di.modules.PetrolEngineModule;
import com.didahdx.dagger2sample.di.modules.WheelsModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }
}
