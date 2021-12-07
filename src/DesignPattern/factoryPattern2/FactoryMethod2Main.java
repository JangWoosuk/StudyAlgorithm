package DesignPattern.factoryPattern2;

public class FactoryMethod2Main {
    public static void main(String[] args) throws InterruptedException{
        AmusementParkOperator amusementParkOperator = new JellyAmusementParkOperator();
        amusementParkOperator.operator();

        AmusementParkOperator amusementParkOperator2 = new BiscuitAmusementParkOperator();
        amusementParkOperator2.operator();

    }
}
