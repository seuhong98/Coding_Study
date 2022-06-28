package Practice.Baekjoon.Sliver.S3_15649;

import java.io.*;
import java.util.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        int M = input.nextInt();
        int temp[]= new int[M];
        boolean check[]=new boolean[N];
        doit(0,temp,check);
    }
    public static void doit(int doit , int book[], boolean check[]) throws IOException {
        if(doit==book.length) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for(int i=0;i<doit;i++) {
                bw.write(String.valueOf(book[i])+" ");
            }
            bw.write("\n");
            bw.flush();
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

}
