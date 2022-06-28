package Practice.Baekjoon.Sliver.S4_11399;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(str.nextToken());
        }
        Arrays.parallelSort(arr);
        long answer=0;
        for(int i=0;i<n;i++) {
            answer=arr[i]*(n-i)+answer;
        }
        System.out.println(answer);
    }

}
