package Practice.Baekjoon.Sliver.S5_10989;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int temp = Integer.parseInt(br.readLine());
        int[] arr = new int[temp];
        for(int i=0;i<temp;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.parallelSort(arr);
        for(int i:arr){
            bw.write(i+"\n"); 
        }
        bw.close();
    }
}
