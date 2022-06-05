package Practice.Baekjoon.Bronze.B1_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] read = Arrays.stream(br.readLine().split(" ")).map(s-> Integer.parseInt(s)).toArray(Integer[]::new);
        int top = 0;
        int sum =0;
        for(int i: read){
            if(i>top){
                top = i;
            }
            sum += i;
        }
        System.out.println((sum*100/(double)(top*n)));
    }
}
