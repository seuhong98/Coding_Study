package Practice.Baekjoon.Gold.G1_1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    static long  min = 0;
    static long max = 0;
    static HashSet<Long> dic;

    public static void main(String[] args){
        ReadInput();
        boolean[] prime = new boolean[(int)(max-min+1)];
        for(long i = min;i<=max;i++){
            //todo: 무슨무슨 체의 원리를 사용해서 처리 해야함
        }
    }

    /**
     * 입력값 받아오기
     */
    public static void ReadInput(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String read = br.readLine();
            String[] read2 = read.split(" ");
            min = Long.parseLong(read2[0]);
            max = Long.parseLong(read2[1]);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
