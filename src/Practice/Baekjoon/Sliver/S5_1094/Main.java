package Practice.Baekjoon.Sliver.S5_1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int X = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        List<Integer> array = new ArrayList<>();
        array.add(64);
        while (true){
            if(sum(array) == X){
                System.out.println(array.size());
                break;
            }
            int split = array.get(0)>>1;
            array.set(0,split);
            if(sum(array) < X ){
                array.add(0,split);
            }
        }
    }

    public static int sum(List<Integer> array){
        int answer = 0;
        for(int i : array){
            answer += i;
        }
        return answer;
    }
}
