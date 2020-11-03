package com.didahdx.dagger2sample.di.components;

import com.didahdx.dagger2sample.Car;
import com.didahdx.dagger2sample.DieselEngine;
import com.didahdx.dagger2sample.MainActivity;
import com.didahdx.dagger2sample.di.modules.DieselEngineModule;
import com.didahdx.dagger2sample.di.modules.PetrolEngineModule;
import com.didahdx.dagger2sample.di.modules.WheelsModule;

import dagger.Component;

@Component(modules = {WheelsModule.class,  DieselEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
