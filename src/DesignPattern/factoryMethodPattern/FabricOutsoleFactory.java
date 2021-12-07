package DesignPattern.factoryMethodPattern;

public class FabricOutsoleFactory implements OutsoleFactory{
    @Override
    public Outsole makeOutsole() {
        return new FabricOutsole();
    }
}
