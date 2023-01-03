package Practice.Baekjoon.Bronze.B2_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        for(int i=0;i<8;i++){
            char[] array = br.readLine().toCharArray();
            Boolean check = i%2 == 0;
            for(int j=0;j<8;j++){
                if(!( check ^ (j%2 == 0)) && (array[j] == 'F')){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
