package com.didahdx.dagger2sample;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
   static Rims providesRims(){
        return new Rims();
    }

    @Provides
   static Tire providesTires(){
        Tire tire=new Tire();
        tire.inflate();
        return tire;
    }

    @Provides
   static Wheels providesWheels(Rims rims,Tire tire){
        return new Wheels(rims,tire);
    }
}
