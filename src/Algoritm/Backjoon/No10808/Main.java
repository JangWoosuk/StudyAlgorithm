package Algoritm.Backjoon.No10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
* */
public class Main {
    public static void main(String [] args){
        solution();
    }
    static void solution(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String inputStr = br.readLine();
            int[] alphabetArr = new int[26];

            for (int i = 0 ; i <inputStr.length(); i++){
                char aa = inputStr.charAt(i);
                alphabetArr[aa-97]++;
            }
            for(int i = 0 ; i<alphabetArr.length;i++){
                System.out.print(alphabetArr[i] + " ");
            }
        }
        catch(IOException io){
            io.printStackTrace();
        }
    }
}
