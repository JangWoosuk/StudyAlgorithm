package study;

import DesignPattern.factoryMethodPattern.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args){
//        System.out.println("hello world!");
//        List<String> list = new ArrayList<>();
//
//        Map<String,String> map = new HashMap<String,String>();
//
//        ShoseCreator shoseCreator = new ShoseCreator();
//        Shose shose = shoseCreator.createShose(new LeatherShoseFactory());
//
//        List<String> list2 = new LinkedList<>();
//
//        Stack<String> stack = new Stack<>();
//
//        Queue<String> test = new LinkedList<>();
//
//
//
//        HashSet set = new HashSet<>();
//        set.add(new String("abc"));
//        set.add(new String("abc"));
//        set.add(new Person("nike" , 10));
//        set.add(new Person("nike" , 10));
//
//
//        HashMap<String,String> map1 = new HashMap<String,String>();
//
//        System.out.println(set.toString());
//
//
//        TreeSet treeSet = new TreeSet();
//
//        for(int i =0 ; i<6; i++){
//            treeSet.add((int)(Math.random()*100)+1);
//        }
//        System.out.println("treeSet: " + treeSet.toString());
//        System.out.println(treeSet.subSet(10,50));
//
//
//
//
//
//        Properties props = new Properties();
//        try {
//            props.load(new FileInputStream("path"));
//            props.getProperty("name");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
        Calc c = new Calc(99,99);

        System.out.println(c.a);
        System.out.println(c.b);

        c = plus(c,33);

        System.out.println(c.a +":::::::::"+ c.b);

    }
    public static Calc plus(Calc c , int b){
        c = new Calc(1,5);
        return c;
    }
}

class Calc {
    int a ;
    int b ;

    public Calc(int a , int b){
        a = this.a;
        b = this.b;
    }

    public Calc plus(int a , int b){
        a = a + b;

        return new Calc(a,b);
    }
}
