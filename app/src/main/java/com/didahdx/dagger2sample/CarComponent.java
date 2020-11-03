package com.didahdx.dagger2sample;

import dagger.Component;

@Component(modules = WheelsModule.class)
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
