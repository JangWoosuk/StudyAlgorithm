package Algoritm.Backjoon.No1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
* 첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다.
*  다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데,
*  이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
*
*   예시 입력
*   5
    4 1 5 2 3    <- 이 값이
    5
    1 3 7 9 5   <- 여기에 존재 하는지.
    예시 출력       현재 1,3,5는 11001 로 0번째 1번째 4번째에 속해 있다.
*   1
    1
    0
    0
    1
*
*
*
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String []  temp = br.readLine().split(" ");
        List<String> nlist = new ArrayList<>();
        for(String tt : temp){
            nlist.add(tt);
        }
        String m = br.readLine();
        String []  tempm = br.readLine().split(" ");
        List<String> mList = new ArrayList<>();
        for(String tt : tempm){
            mList.add(tt);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<mList.size(); i++){
            if(nlist.contains(mList.get(i))){
                sb.append("1").append("\n");
            }
            else{
                sb.append("0").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
