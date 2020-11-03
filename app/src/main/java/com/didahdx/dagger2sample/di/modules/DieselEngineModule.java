package com.didahdx.dagger2sample.di.modules;

import com.didahdx.dagger2sample.DieselEngine;
import com.didahdx.dagger2sample.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    //use binds when binding an implementation to an interface
    @Binds
    abstract Engine bindsDieselEngine(DieselEngine engine);
}
