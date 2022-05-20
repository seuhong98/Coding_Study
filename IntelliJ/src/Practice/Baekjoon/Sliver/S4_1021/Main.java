package Practice.Baekjoon.Sliver.S4_1021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int length =0;
    static int want_nm[];
    public static void main(String[] args) {
        Read();
        System.out.println(length);
        System.out.println(Arrays.toString(want_nm));
    }

    public static void Read(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] read1 = br.readLine().split(" ");
            length = Integer.parseInt(read1[0]);
            want_nm = new int[Integer.parseInt(read1[1])];
            int count=0;
            for(String temp : br.readLine().split(" ")){
                want_nm[count] = Integer.parseInt(temp);
                count++;
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
