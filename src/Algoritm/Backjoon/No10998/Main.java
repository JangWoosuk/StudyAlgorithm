package Algoritm.Backjoon.No10998;

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

            System.out.println(a*b);
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
