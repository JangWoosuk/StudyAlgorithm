package Algoritm.Backjoon.No10869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        solution();
    }

    static void solution(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String [] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            System.out.println(plus(a,b));
            System.out.println(minus(a,b));
            System.out.println(multiply(a,b));
            System.out.println(divide(a,b));
            System.out.println(etc(a,b));
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
    static int plus(int a , int b){
        return a+b;
    }
    static int minus(int a , int b){
        return a-b;
    }
    static int multiply(int a , int b){
        return a*b;
    }
    static int divide(int a , int b){
        return a/b;
    }
    static int etc(int a , int b){
        return a%b;
    }
}
