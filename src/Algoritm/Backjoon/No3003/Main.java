package Algoritm.Backjoon.No3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String [] args){
        int [] result = new int [6];
        int [] chess = new int [6];
        chess[0]=1;
        chess[1]=1;
        chess[2]=2;
        chess[3]=2;
        chess[4]=2;
        chess[5]=8;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try{
                String [] arr = br.readLine().split(" ");
                for(int i = 0 ; i<arr.length; i++){
                    result[i] = chess[i] - Integer.parseInt(arr[i]);
                }
                System.out.println(result[0] + " " + result[1] + " " + result[2]+ " " + result[3] + " " +result[4] + " " + result[5]);
            }catch(IOException e){
                e.printStackTrace();
        }
    }
}
