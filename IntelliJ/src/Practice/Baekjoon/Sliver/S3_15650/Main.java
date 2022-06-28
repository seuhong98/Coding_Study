package Practice.Baekjoon.Sliver.S3_15650;

import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static boolean Tcheck[];
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        int M = input.nextInt();
        int temp[]= new int[M];
        Tcheck= new boolean[(int)Math.pow(2, N)];
        boolean check[]=new boolean[N];
        doit(0,temp,check);
    }
    public static void doit(int doit , int book[], boolean check[]) throws IOException {
        if(doit==book.length) {
            int ttt=what(check);
            if(!Tcheck[ttt]) {
                Tcheck[ttt]=true;
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                for(int i=0;i<doit;i++) {
                    bw.write(String.valueOf(book[i])+" ");
                }
                bw.write("\n");
                bw.flush();
            }
        }else {
            for(int i=1;i<=N;i++) {
                if(!check[i-1]) {
                    book[doit]=i;
                    check[i-1]=true;
                    doit(doit+1,book,check);
                    check[i-1]=false;
                }
            }
        }
    }
    public static int what(boolean a[]) {
        StringBuffer sb= new StringBuffer();
        for(int i=0;i<a.length;i++) {
            if(a[i]) {
                sb.append('1');
            }else {
                sb.append('0');
            }
        }
        return Integer.parseInt(sb.toString(),2);
    }
}
