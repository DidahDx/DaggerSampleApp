package com.didahdx.dagger2sample.di.components;

import android.app.AlertDialog.Builder;

import com.didahdx.dagger2sample.car.Car;
import com.didahdx.dagger2sample.MainActivity;
import com.didahdx.dagger2sample.di.PerActivity;
import com.didahdx.dagger2sample.di.modules.DieselEngineModule;
import com.didahdx.dagger2sample.di.modules.PetrolEngineModule;
import com.didahdx.dagger2sample.di.modules.WheelsModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

//    //sample sub
//    @Subcomponent.Builder
//    interface Builder{
//
//        Builder horsePower(@BindsInstance @Named("horse power") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
//
//
//        ActivityComponent build();
//    }

    @Subcomponent.Factory
    interface Factory{
        ActivityComponent create(@BindsInstance @Named("horse power") int horsePower,
                                 @BindsInstance @Named("engine capacity") int engineCapacity);
    }
}
