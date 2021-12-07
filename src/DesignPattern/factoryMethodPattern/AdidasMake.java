package DesignPattern.factoryMethodPattern;

public class AdidasMake extends ShoseMake{
    @Override
    public Shose callBrand() {
        return new Adidas();
    }
}
