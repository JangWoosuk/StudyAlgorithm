package Algoritm.Backjoon.No1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
        // No.1000
//        if(0<a && b <10){
//            System.out.println(a+b);
//        }

        // No.1002
//        if(a<b){
//            System.out.println("<");
//        }
//        else if (a>b){
//            System.out.println(">");
//        }
//        else{
//            System.out.println("==");
//        }
        //No.1550 16진수 확인

//        String a = sc.next();
//        System.out.println(Integer.parseInt(a , 16));
//
        //No.2558

//        int a = Integer.parseInt(sc.nextLine());
//        int b = Integer.parseInt(sc.nextLine());
//
//        if(0<a && b <10){
//            System.out.println(a+b);
//        }

        //No.2741
//        int n = sc.nextInt();
//
//        if(n<= 100000){
//            for(int i = n; i > 0 ; i--){
//                System.out.println(i);
//            }
//        }
//        else{
//            return;
//        }

        //No. 2752
            int[] num = new int[3];
            for(int i=0; i<3; i++) num[i] = sc.nextInt();
            Arrays.sort(num);
            for (int i : num)
                System.out.print(i+" ");

    }
}
