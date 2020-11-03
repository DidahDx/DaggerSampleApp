package com.didahdx.dagger2sample;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
