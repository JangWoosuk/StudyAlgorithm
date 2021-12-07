package DesignPattern.factoryPattern;

public class AmusementParkOperator {

    public void operator() throws InterruptedException{
        AmusementPark amuse = new JellyAmusementPark();
        amuse.open();
        Thread.sleep(2000);
        amuse.close();
    }
}
