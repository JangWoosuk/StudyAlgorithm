package DesignPattern.factoryMethodPattern;

public class FabricShoseFactory implements ShoseFactory {
    @Override
    public Material makeMaterial() {
        return new FabricMaterial();
    }

    @Override
    public Outsole makeOutsole() {
        return new FabricOutsole();
    }
}
