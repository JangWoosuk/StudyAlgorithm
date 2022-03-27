package Algoritm.Backjoon.No1655;

import java.util.*;

/**
 * 백준이는 동생에게 "가운데를 말해요" 게임을 가르쳐주고 있다.
 * 백준이가 정수를 하나씩 외칠때마다 동생은 지금까지 백준이가 말한 수 중에서 중간값을 말해야 한다.
 * 만약, 그동안 백준이가 외친 수의 개수가 짝수개라면 중간에 있는 두 수 중에서 작은 수를 말해야 한다.
 *
 * 예를 들어 백준이가 동생에게 1, 5, 2, 10, -99, 7, 5를 순서대로 외쳤다고 하면,
 * 동생은 1, 1, 2, 2, 2, 2, 5를 차례대로 말해야 한다.
 * 백준이가 외치는 수가 주어졌을 때, 동생이 말해야 하는 수를 구하는 프로그램을 작성하시오.
 *  1 = 1
 *  1,5 = 1
 *  1,5,2 = 2
 *  1,2,5,10 =2
 *  1,5,2,10,-99   == -99 1 2 5 10 => 2
 *  -99 1 2 5 10 7 = 2
 *  -99 1 2 5 5 7 10 = 5
  * 입력
 * 첫째 줄에는 백준이가 외치는 정수의 개수 N이 주어진다.
 * N은 1보다 크거나 같고, 100,000보다 작거나 같은 자연수이다.
 * 그 다음 N줄에 걸쳐서 백준이가 외치는 정수가 차례대로 주어진다.
 * 정수는 -10,000보다 크거나 같고, 10,000보다 작거나 같다.
 *
 * 출력
 * 한 줄에 하나씩 N줄에 걸쳐 백준이의 동생이 말해야 하는 수를 순서대로 출력한다.
 *
 *
 */
public class Main {
    public static void main(String [] args){
        solution();
    }
    public static void solution(){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pQ = new PriorityQueue<Integer>((v1 , v2) -> v1 - v2);
        PriorityQueue<Integer> rQ = new PriorityQueue<Integer>((v1 , v2) -> v2 - v1);

        for(int i = 0 ; i <size ; i++){
            if(pQ.size() == rQ.size()){
                rQ.add(sc.nextInt());
            }
            else{
                pQ.add(sc.nextInt());
            }
            if(!rQ.isEmpty() && !pQ.isEmpty())
                if(pQ.peek() <rQ.peek()){
                    int temp = pQ.poll();
                    pQ.add(rQ.poll());
                    rQ.add(temp);
                }

                sb.append(rQ.peek() +"\n");
            }

        System.out.println(sb);
    }
    public static void solution2(){
        Scanner sc = new Scanner(System.in);
        int[] backjoon = new int[sc.nextInt()];

        for(int i = 0 ; i <backjoon.length; i++){
            backjoon[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i<backjoon.length; i++){
            list.add(backjoon[i]);
            Collections.sort(list);
            if(list.size()%2 == 0){
                System.out.println(list.get((list.size()/2)-1));
            }
            else{
                System.out.println(list.get(list.size()/2));
            }
        }


    }
}
