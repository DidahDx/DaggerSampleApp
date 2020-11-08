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
@Subcomponent(modules = {WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

//    @Component.Builder
//    interface Builder{
//
//        @BindsInstance
//        Builder horsePower(@Named("horse power") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
//
//        Builder appComponent(AppComponent appComponent);
//
//        ActivityComponent build();
//    }
}
