package DesignPattern.factoryMethodPattern;

public class LimitedShose extends Shose {
    String limit;

    public LimitedShose(String limit){
        this.limit = limit;
    }

    public String toString(){
        return this.limit;
    }
}
