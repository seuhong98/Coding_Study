package Practice.Baekjoon.Sliver.S3_1002;

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer[]=new int[Integer.parseInt(input)];
        for(int doing=0;doing<answer.length;doing++) {
            input = br.readLine();
            String arr[]=input.split(" ");
            int array[]=new int[arr.length];
            for(int i=0;i<arr.length;i++) {
                array[i]=Integer.parseInt(arr[i]);
            }
            int ww1=array[0]-array[3];
            int ww2=array[1]-array[4];
            double d=Math.sqrt((ww1*ww1+ww2*ww2));
            if(Math.abs(array[2]-array[5])<d&&array[2]+array[5]>d) {
                answer[doing]=2;
            }else if(d==0&&array[2]==array[5]) {
                answer[doing]=-1;
            }
            else if(d==array[2]+array[5]||d==Math.abs(array[2]-array[5])) {
                answer[doing]=1;
            }else if(array[2]+array[5]<d||d<array[2]+array[5]) {
                answer[doing]=0;
            }
        }
        for(int i=0;i<answer.length;i++) {
            System.out.println(answer[i]);
        }
    }

}
