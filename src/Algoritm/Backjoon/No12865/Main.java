package Algoritm.Backjoon.No12865;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
* 문제
이 문제는 아주 평범한 배낭에 관한 문제이다.

한 달 후면 국가의 부름을 받게 되는 준서는 여행을 가려고 한다. 세상과의 단절을 슬퍼하며 최대한 즐기기 위한 여행이기 때문에, 가지고 다닐 배낭 또한 최대한 가치 있게 싸려고 한다.

준서가 여행에 필요하다고 생각하는 N개의 물건이 있다. 각 물건은 무게 W와 가치 V를 가지는데, 해당 물건을 배낭에 넣어서 가면 준서가 V만큼 즐길 수 있다.
아직 행군을 해본 적이 없는 준서는 최대 K만큼의 무게만을 넣을 수 있는 배낭만 들고 다닐 수 있다. 준서가 최대한 즐거운 여행을 하기 위해 배낭에 넣을 수 있는 물건들의 가치의 최댓값을 알려주자.

입력
첫 줄에 물품의 수 N(1 ≤ N ≤ 100)과 준서가 버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)가 주어진다.
두 번째 줄부터 N개의 줄에 거쳐 각 물건의 무게 W(1 ≤ W ≤ 100,000)와 해당 물건의 가치 V(0 ≤ V ≤ 1,000)가 주어진다.

입력으로 주어지는 모든 수는 정수이다.

출력
한 줄에 배낭에 넣을 수 있는 물건들의 가치합의 최댓값을 출력한다.

예상입력
4 7
6 13
4 8
3 6
5 12

예상출력
14

첫줄이 n , k
둘째줄부터 w,v
최대로 가져갈수 있는 v 값을 구하자.
*
* */

public class Main{
    public static void main(String[] args){
        
    }
}



/**
public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(solution());
        }catch(IOException e ){
            e.printStackTrace();
        }
    }
    public static int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nk = br.readLine();
        int n  = Integer.parseInt(nk.split(" ")[0]);
        int k  = Integer.parseInt(nk.split(" ")[1]);

        List<Item> itemList = new ArrayList<Item>();
        for(int i = 0 ; i <n ; i++){
            String read = br.readLine();
            itemList.add(new Item (Integer.parseInt(read.split(" ")[0]), Integer.parseInt(read.split(" ")[1])));
        }
//        itemList.forEach(item -> System.out.println("w = " + item.getW() + " v = " + item.getV()));

        int result = arrangeBag(itemList , k);

        return result;
    }
    private static int arrangeBag(List<Item> itemList, int k) {
        int result = 0;
        List<Item> sortList = itemList.stream().sorted((a,b) -> a.getW() - b.getW()).collect(Collectors.toList());
        for(int i = 0 ; i< sortList.size(); i++){
            int w = sortList.get(i).getW();
            for(int j = 0 ; j<sortList.size() ; j++){
                if(i == j )
                    continue;

                if(w + sortList.get(j).getW() <= k ){
                    w = w + sortList.get(j).getW();
                    if(result < sortList.get(i).getV()+ sortList.get(j).getV()){
                        result = sortList.get(i).getV()+ sortList.get(j).getV();
                    }
                }
                else{
                    if(result< sortList.get(i).getV()){
                        result = sortList.get(i).getV();
                    }
                }
            }
        }
        return result;
    }
    static class Item{
        int w , v;

        public Item(int w, int v) {
            this.w = w;
            this.v = v;
        }

        public int getW() {
            return w;
        }

        public void setW(int w) {
            this.w = w;
        }

        public int getV() {
            return v;
        }

        public void setV(int v) {
            this.v = v;
        }
    }
}*/