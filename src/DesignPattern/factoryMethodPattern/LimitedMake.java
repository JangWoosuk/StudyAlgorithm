package DesignPattern.factoryMethodPattern;

public class LimitedMake extends ShoseMake{
    String brand;

    public LimitedMake(String brand){
        this.brand = brand;
    }

    @Override
    public Shose callBrand() {
        return new LimitedShose(this.brand);
    }
}
