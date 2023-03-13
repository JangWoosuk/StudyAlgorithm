package Algoritm.Backjoon.No18108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int bull = Integer.parseInt(br.readLine());
            System.out.println(bull-543);
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
