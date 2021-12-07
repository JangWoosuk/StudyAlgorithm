package DesignPattern.factoryMethodPattern;

public class Shose {
    Material material;
    Outsole outsole;
    public void makeShose(){
        System.out.println(toString() + "가 만들어 졌습니다.");
    }
    public void shoseMaterial(){
        System.out.println(material);
    }
    public void shoseOutsole(){
        System.out.println(outsole);
    }
}