package Algoritm.Backjoon.No25501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    private static int callCnt;
    public static int recursion(String s, int l, int r){
        callCnt++;
        if(l >= r)
            return 1;
        else if(s.charAt(l) != s.charAt(r))
            return 0;
        else
            return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
        solution();
    }
    static void solution(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCount = 0;
         try {
             testCount = Integer.parseInt(br.readLine());
             for(int i = 0; i<testCount; i++) {
                 String temp = br.readLine();
                 System.out.println(isPalindrome(temp) + " " + callCnt);
                 callCnt = 0;
             }
         }
         catch
         (IOException e){
             e.printStackTrace();
         }
    }
}