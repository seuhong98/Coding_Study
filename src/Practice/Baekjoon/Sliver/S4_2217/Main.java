package Practice.Baekjoon.Sliver.S4_2217;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howmany=Integer.parseInt(br.readLine());
        int arr[] = new int[howmany];
        for(int i=0;i<howmany;i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.parallelSort(arr);
        int max=0;
        int where=1;
        for(int i =arr.length-1; i>=0;i--) {
            int temp=where*arr[i];
            if(temp>max) {
                max=temp;
            }
            where++;
        }
        System.out.println(max);
    }

}

