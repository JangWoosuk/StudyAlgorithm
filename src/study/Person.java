package study;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "name : " +  this.name + " age : " + this.age;
    }

    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person temp = (Person)obj;
            return temp.name.equals(this.name) && temp.age == this.age;
        }
        return false;
    }

    public int hashCode(){
        return Objects.hash(name,age);
    }
}
