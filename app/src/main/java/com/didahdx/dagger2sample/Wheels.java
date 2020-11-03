package com.didahdx.dagger2sample;

public class Wheels {
    //when we dont own this class , class comes from a library

    Rims rims;
    Tire tire;

    public Wheels(Rims rims, Tire tire) {
        this.rims = rims;
        this.tire = tire;
    }
}
