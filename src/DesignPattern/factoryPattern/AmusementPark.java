package DesignPattern.factoryPattern;

public class AmusementPark {
    public void open(){
        System.out.println(toString() + "이(가) 생겼습니다.");
    }
    public void close(){
        System.out.println(toString() + "이(가) 폐쇄되었습니다.");
    }
}
