package com.didahdx.dagger2sample.car;

import javax.inject.Inject;
import javax.inject.Singleton;


public class Driver {
    //we dont own this class

    String name;

    public Driver(String name) {
        this.name = name;
    }
}
