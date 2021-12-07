package DesignPattern.factoryMethodPattern;

public abstract class ShoseMake {

    public void makeShose(){
        Shose shose = callBrand();
        shose.makeShose();

    }
    public abstract Shose callBrand();
}
