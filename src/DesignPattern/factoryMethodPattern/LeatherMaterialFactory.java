package DesignPattern.factoryMethodPattern;

public class LeatherMaterialFactory implements MaterialFactory {

    @Override
    public Material makeMaterial() {
        return new LeatherMaterial();
    }
}
