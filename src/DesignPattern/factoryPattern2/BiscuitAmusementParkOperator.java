package DesignPattern.factoryPattern2;

import DesignPattern.factoryPattern.AmusementPark;
import DesignPattern.factoryPattern.BiscuitAmusementPark;

public class BiscuitAmusementParkOperator extends AmusementParkOperator {

    @Override
    public AmusementPark makeAmusementPark() {
        return new BiscuitAmusementPark();

    }
}
