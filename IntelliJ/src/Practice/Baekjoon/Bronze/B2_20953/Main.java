package Practice.Baekjoon.Bronze.B2_20953;

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int how = Integer.parseInt(br.readLine());
        for(int i=0;i<how;i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(str.nextToken());
            int b=Integer.parseInt(str.nextToken());
            bw.write(String.valueOf(dolmen(a, b))+"\n");
        }
        bw.flush();

    }
    public static int dolmen(int a, int b) {
        int sum=0;
        for(int j=0;j<a+b;j++) {
            for(int k=0;k<j;k++) {
                sum++;
            }

        }
        return sum*(a+b);
    }

}

