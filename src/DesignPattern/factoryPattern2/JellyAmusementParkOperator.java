package DesignPattern.factoryPattern2;

import DesignPattern.factoryPattern.AmusementPark;
import DesignPattern.factoryPattern.JellyAmusementPark;

public class JellyAmusementParkOperator extends AmusementParkOperator{
    @Override
    public AmusementPark makeAmusementPark() {
        return new JellyAmusementPark();
    }
}
