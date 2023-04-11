package Algoritm.Backjoon.No11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 각 원판은 반경이 큰 순서대로 쌓여있다. 이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.
 *
 * 한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
 * 쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
 * 이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.
 *
 * 아래 그림은 원판이 5개인 경우의 예시이다.
 *
 * 1                        1
 * 2                        2
 * 3            ->          3
 * 4                        4
 * 5                        5
 * 1원판       2원판         3원판
 * 으로 이동.
 *
 * 입력
 * 첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1 ≤ N ≤ 20)이 주어진다.
 *
 * 출력
 * 첫째 줄에 옮긴 횟수 K를 출력한다.
 *
 * 두 번째 줄부터 수행 과정을 출력한다. 두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데, 이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.
 *
 * 1원판에서 가장 큰 숫자가 3원판으로 옮겨 갈때 원판이 이동하는 경우는 n-1개의 숫자가 이동하며 마지막에 가장큰 숫자가 3원판으로 이동함
 * => (n-1) +1
 * 2원판으로 옮겨진 숫자가 3원판으로 이동 하는경우는 n-1만큼 움직인다.
 *
 * x = (n-1) +1 + (n-1)
 * x = 2(n-1) +1
 * x+1 = 2(n-1)
 * x +1 = 2n -2
 * x = 2^n -1
 * 이 성립
 * n = 3 일 경우
 * 8 -1 = 7
 * x = 7 -> k
 * */
public class Main {
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args){
        solution();
    }
    public static void solution(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try{
            n = Integer.parseInt(br.readLine());
        }catch(IOException io ){
            io.printStackTrace();
        }

        hanoi(n , 1,2,3);
        System.out.println(sb.toString());
    }
    static void hanoi(int n , int start, int mid, int to){
        if(n == 1){
            sb.append(start + " " + to + "\n");
            return ;
        }
        hanoi(n-1 , start, to, mid);

        sb.append(start + " " + to + "\n");

        hanoi(n-1 , mid, start, to);
    }
}
