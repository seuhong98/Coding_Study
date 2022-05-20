package Practice.Baekjoon.Sliver.S4_1021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static int length =0; //총 길이
    static List<Integer> want_nm; //원하는 위치 들

    static int answer = 0;
    static int now=1; //현재 내 위치
    public static void main(String[] args) {
        Read();
        makeAnswer();
        System.out.println(answer);
    }


    public static void makeAnswer(){
        while (want_nm.size() != 0){
            if(want_nm.get(0) == now){
                Remove(want_nm.get(0));
            }else{
                move(want_nm.get(0));
            }


        }
    }

    /**
     * 원하는 위치로 이동
     * @param where 이동하고 싶은 위치
     * @return 가는데 들어가는 최소 코스트
     */
    public static void move(int where){
        int big = where > now ? where : now;
        int small = where < now ? where : now;
        int count = (big-small)<(length-big+small) ? (big-small) : (length-big+small);
        now = where;
        answer += count;
    }


    public static void Remove(int item){
        for(int i =1;i<want_nm.size();i++){
            if(want_nm.get(i)>item){
                want_nm.set(i,want_nm.get(i)-1);
            }
        }
        length--;
        want_nm.remove(0);
    }

    /**
     * 값 받아오기
     */
    public static void Read(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        want_nm = new ArrayList<Integer>();
        try{
            String[] read1 = br.readLine().split(" ");
            length = Integer.parseInt(read1[0]);
            for(String temp : br.readLine().split(" ")){
                want_nm.add(Integer.parseInt(temp));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                br.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
