package Practice.Baekjoon.Bronze.B2_2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int where = -1;
        for(int i=0;i<9;i++){
            int read = Integer.parseInt(br.readLine());
            if(read>max){
                max =read;
                where =i+1;
            }
        }
        System.out.println(max);
        System.out.println(where);
    }
}
