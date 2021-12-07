package DesignPattern.factoryMethodPattern;

public class NikeMake extends ShoseMake{
    @Override
    public Shose callBrand() {
        return new Nike();
    }
}
