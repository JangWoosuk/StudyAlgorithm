package Algoritm.Backjoon.No10926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        solution();
    }
    static void solution(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder br = new StringBuilder();
        try{
            br.append(bufferedReader.readLine());
            br.append("??!");

            System.out.println(br.toString());
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
