package com.didahdx.dagger2sample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.didahdx.dagger2sample.car.Car;
import com.didahdx.dagger2sample.di.components.ActivityComponent;
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

        ActivityComponent activityComponent = ((App) getApplication()).getAppComponent()
                .getActivityComponentBuilder().horsePower(120).engineCapacity(1200).build();

        activityComponent.inject(this);
        car = activityComponent.getCar();
        car.drive();

        car2.drive();
    }
}