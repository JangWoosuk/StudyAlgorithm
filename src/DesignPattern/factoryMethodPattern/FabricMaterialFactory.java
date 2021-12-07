package DesignPattern.factoryMethodPattern;

public class FabricMaterialFactory implements MaterialFactory {
    @Override
    public Material makeMaterial() {
        return new FabricMaterial();
    }
}
