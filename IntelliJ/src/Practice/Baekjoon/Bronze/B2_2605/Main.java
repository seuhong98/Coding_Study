package Practice.Baekjoon.Bronze.B2_2605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int person = Integer.parseInt(br.readLine());
        Integer[] read = Arrays.stream(br.readLine().split(" ")).map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
        LinkedList<Integer> answer = new LinkedList<>();
        for(int i=0;i<read.length;i++){
            if(read[i]==0){
                answer.add(i+1);
            }else{
                answer.add(i-read[i],i+1);
            }
        }
        for(int i : answer){
            System.out.print(i+" ");
        }
    }
}
