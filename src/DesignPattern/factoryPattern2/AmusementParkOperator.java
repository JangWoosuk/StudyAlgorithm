package DesignPattern.factoryPattern2;

import DesignPattern.factoryPattern.AmusementPark;

public abstract class AmusementParkOperator {

    public void operator() throws InterruptedException{
        AmusementPark amusementPark = makeAmusementPark();
        amusementPark.open();
        Thread.sleep(3000);
        amusementPark.close();
    }

    public abstract AmusementPark makeAmusementPark();
}
