package Practice.Baekjoon.Sliver.S4_1026;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static Integer A[];
    static Integer B[];
    public static void main(String[] args) {
        int answer =0;
        Read();
        for(int i=0;i<A.length;i++){
            answer += A[i] * B[i];
        }
        System.out.println(answer);
    }


    public static void Read(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            br.readLine();
            A = Arrays.stream(br.readLine().split(" ")).map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
            B = Arrays.stream(br.readLine().split(" ")).map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
            Arrays.sort(A);
            Arrays.sort(B, Collections.reverseOrder());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
