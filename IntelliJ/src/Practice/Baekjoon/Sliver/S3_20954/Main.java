package Practice.Baekjoon.Sliver.S3_20954;

import java.io.*;
import java.util.*;
public class Main {
    static long pppp=0;
    static int pa;
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int how = Integer.parseInt(br.readLine());
        for(int ii=0;ii<how;ii++) {
            pppp=0;
            bw.write(String.valueOf(make(Integer.parseInt(br.readLine())))+"\n");
        }
        bw.flush();
    }
    public static long make(int a) {
        int past=1;
        if(a==0) {
            return 0;
        }else if(a==1) {
            return 1;
        }else if(a==-1) {
            return 3;
        }else {
            if(a<0) {
                while(past<(a*-1)) {
                    past=past<<1;
                }
            }else {
                while(past<(a)) {
                    past=past<<1;
                }
                past=past>>1;
                past=past*-1;
            }
            pa=past;
            while(!(pa==-1)) {
                past();
            }
            return Math.abs(past)+Math.abs(a)+pppp+3;
        }
    }
    public static void past() {
        if(pa<0) {
            pppp=pppp+((pa*-1)<<1);
            pa=pa*-1;
        }else {
            pppp=pppp+(pa+(pa>>1));
            pa=-1*(pa>>1);
        }
    }
}
