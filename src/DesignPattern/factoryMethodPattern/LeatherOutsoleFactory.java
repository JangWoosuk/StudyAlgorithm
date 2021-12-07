package DesignPattern.factoryMethodPattern;

public class LeatherOutsoleFactory implements OutsoleFactory{
    @Override
    public Outsole makeOutsole() {
        return new LeatherOutsole();
    }
}
