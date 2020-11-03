package com.didahdx.dagger2sample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.didahdx.dagger2sample.di.components.CarComponent;
import com.didahdx.dagger2sample.di.components.DaggerCarComponent;
import com.didahdx.dagger2sample.di.modules.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    Car car;

    //field injection can not be private
    @Inject
    Car car2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(2000)).build();
        carComponent.inject(this);
        car = carComponent.getCar();
        car.drive();

        car2.drive();
    }
}