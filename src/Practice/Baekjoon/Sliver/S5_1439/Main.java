package Practice.Baekjoon.Sliver.S5_1439;

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        char temp = ' ';
        int di=0;
        for(int i=0;i<in.length();i++) {
            if(temp !=in.charAt(i)) {
                temp=in.charAt(i);
                di++;
            }
        }
        boolean arr[]=new boolean[di];
        temp=' ';
        di=-1;
        int T=0;
        int F=0;
        for(int i=0;i<in.length();i++) {
            if(temp !=in.charAt(i)) {
                temp=in.charAt(i);
                di++;
                if(temp=='1') {
                    arr[di]=true;
                    T++;
                }
            }
        }//데이터 정제 끝
        F=arr.length-T;
        if(F>T) {
            System.out.println(T);
        }else {
            System.out.println(F);
        }
    }

}
