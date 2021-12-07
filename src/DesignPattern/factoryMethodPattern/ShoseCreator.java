package DesignPattern.factoryMethodPattern;

public class ShoseCreator {
    public Shose createShose(ShoseFactory sf){
        Shose shose = new Nike();
        shose.material = sf.makeMaterial();
        shose.outsole = sf.makeOutsole();
        return shose;
    }
}






