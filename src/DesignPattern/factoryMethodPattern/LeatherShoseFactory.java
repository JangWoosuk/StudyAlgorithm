package DesignPattern.factoryMethodPattern;

public class LeatherShoseFactory implements  ShoseFactory{

    @Override
    public Material makeMaterial() {
        return new LeatherMaterial();
    }

    @Override
    public Outsole makeOutsole() {
        return new LeatherOutsole();
    }
}
