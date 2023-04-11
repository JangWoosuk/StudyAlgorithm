package Algoritm.Backjoon.No4779;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 *칸토어 집합은 0과 1사이의 실수로 이루어진 집합으로, 구간 [0, 1]에서 시작해서 각 구간을 3등분하여 가운데 구간을 반복적으로 제외하는 방식으로 만든다.
 *
 * 전체 집합이 유한이라고 가정하고, 다음과 같은 과정을 통해서 칸토어 집합의 근사를 만들어보자.
 *
 * 1. -가 3N개 있는 문자열에서 시작한다.
 *
 * 2. 문자열을 3등분 한 뒤, 가운데 문자열을 공백으로 바꾼다. 이렇게 하면, 선(문자열) 2개가 남는다.
 *
 * 3. 이제 각 선(문자열)을 3등분 하고, 가운데 문자열을 공백으로 바꾼다. 이 과정은 모든 선의 길이가 1일때 까지 계속 한다.
 *
 * 예를 들어, N=3인 경우, 길이가 27인 문자열로 시작한다.
 *
 * ---------------------------
 * 여기서 가운데 문자열을 공백으로 바꾼다.
 *
 * ---------         ---------
 * 남은 두 선의 가운데 문자열을 공백으로 바꾼다.
 *
 * ---   ---         ---   ---
 * 한번 더
 *
 * - -   - -         - -   - -
 * 모든 선의 길이가 1이면 멈춘다. N이 주어졌을 때, 마지막 과정이 끝난 후 결과를 출력하는 프로그램을 작성하시오.
 * 좀더 생각!
 * */


public class Main {
    static int n ;
    public static void main(String[] args) throws IOException{
        solution();
    }
    static void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while ((str = br.readLine()) != null) {
            try {
                n = Integer.parseInt(str);
            }catch(NumberFormatException e){
                break;
            }
            if(n < 0 || n>= 13){
                return;
            }
            if(n == 0){
                sb.append("-");
                sb.append("\n");
                continue;
            }
            char[] arr = new char[(int)Math.pow(3,n)];

            for(int i = 0; i<arr.length; i ++){
                arr[i] = '-';
            }

            arr = kanto(n,arr);

            for(int i = 0 ; i < arr.length; i++){
                sb.append(arr[i]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());

    }

    private static char[] kanto(double n, char[] arr) {
        if(n == 0){
            return arr;
        }
        int blankCnt = (int)Math.pow(3,n-1);
        boolean flag = false;
        int cnt = 0;

        for(int i = 0 ; i<arr.length; i++){

            if(i%blankCnt == 0 && i!= 0){
                flag = !flag;
            }
            if (cnt == blankCnt){
                flag = false;
                cnt = 0;
            }
            else if (flag == true){
                arr[i] = ' ';
                cnt++;
            }
        }
        return kanto(n-1, arr);
    }
}
