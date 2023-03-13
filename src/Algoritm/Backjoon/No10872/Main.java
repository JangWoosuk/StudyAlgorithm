package Algoritm.Backjoon.No10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 팩토리얼 문제 (재귀함수 사용)
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 * */

public class Main {
    static int result =0;
    public static void main(String [] args){
        try {
            System.out.println(solution());
        }
        catch (IOException io ){
            io.printStackTrace();
        }
    }

    static int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        return factorial(n);
    }

    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
            return n * factorial(n-1);
        /** 5이라 가정시 마지막엔 리턴 1 이 되기때문에
         * 5*4*(3*(2*(1 *1)))))
         * 로정리 가능하다.
         * */
    }
}
