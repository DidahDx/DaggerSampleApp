package com.didahdx.dagger2sample.di.modules;

import com.didahdx.dagger2sample.car.Engine;
import com.didahdx.dagger2sample.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    //use binds when binding an implementation to an interface

    @Binds
    abstract Engine bindsPetrolEngine(PetrolEngine engine);
}
