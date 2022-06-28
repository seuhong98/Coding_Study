package Practice.Baekjoon.Bronze.B3_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Integer read[] = Arrays.stream(br.readLine().split(" ")).map(s->Integer.parseInt(s)).toArray(Integer[]::new);
        int big=-1000001;
        int min = 1000001;
        for(int i:read){
            if(i>big){
                big = i;
            }
            if(i<min){
                min = i;
            }
        }
        System.out.println(min+" "+big);
    }
}
