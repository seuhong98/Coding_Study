package Practice.Baekjoon.Sliver.S4_11047;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());
        int arr[]= new int[N];
        int how=0;
        for(int i=0;i<N;i++) {
            int temp=Integer.parseInt(br.readLine());
            if(temp<=K) {
                arr[how]=temp;
                how ++;
            }
        }
        int book[]=new int[how];
        for(int i=0;i<how;i++) {
            book[i]=arr[how-i-1];
        }
        int answer=0;
        int count=0;
        while(count<how) {
            if(K>=book[count]) {
                answer=answer+K/book[count];
                K=K%book[count];
            }
            count++;
        }
        System.out.println(K+answer);
    }

}
