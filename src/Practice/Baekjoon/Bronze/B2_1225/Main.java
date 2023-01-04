package Practice.Baekjoon.Bronze.B2_1225;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        char[] fir = temp[0].toCharArray();
        char[] sec = temp[1].toCharArray();
        long sum1 = 0;
        long sum2 = 0;
        for(int i=0;i< sec.length;i++){
            sum1+= (sec[i]-48);
        }
        for(int i=0;i< fir.length;i++){
            sum2+= (fir[i]-48);
        }
        System.out.println(sum1*sum2);

    }
}
