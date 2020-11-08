package com.didahdx.dagger2sample.di.components;

import com.didahdx.dagger2sample.di.modules.DieselEngineModule;
import com.didahdx.dagger2sample.di.modules.DriverModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);
}