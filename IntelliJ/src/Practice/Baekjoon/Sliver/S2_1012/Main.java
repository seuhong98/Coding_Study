package Practice.Baekjoon.Sliver.S2_1012;

import java.util.*;
import java.io.*;
public class Main {
    static boolean xy[][];
    static int answer;
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int how=Integer.parseInt(br.readLine());
        for(int i=0;i<how;i++) {
            answer=0;
            String data = br.readLine();

            StringTokenizer str = new StringTokenizer(data);
            int x = Integer.parseInt(str.nextToken());
            int y = Integer.parseInt(str.nextToken());
            int howmany =Integer.parseInt(str.nextToken());
            xy =new boolean[x][y];
            for(int k=0;k<howmany;k++) {
                data = br.readLine();
                str = new StringTokenizer(data);
                int X = Integer.parseInt(str.nextToken());
                int Y = Integer.parseInt(str.nextToken());
                xy[X][Y]=true;
            }
            for(int k=0;k<x;k++) {
                for(int j=0;j<y;j++) {
                    if(xy[k][j]) {
                        answer++;
                        makeFalse(k,j);
                    }
                }
            }
            bw.write(String.valueOf(answer)+"\n");
        }
        bw.flush();
    }
    public static void makeFalse(int x, int y) {
        xy[x][y]=false;
        try {
            if(xy[x-1][y]) {
                makeFalse(x-1,y);
            }
        }catch(Exception e) {};
        try {
            if(xy[x+1][y]) {
                makeFalse(x+1,y);
            }
        }catch(Exception e) {};
        try {
            if(xy[x][y-1]) {
                makeFalse(x,y-1);
            }
        }catch(Exception e) {};
        try {
            if(xy[x][y+1]) {
                makeFalse(x,y+1);
            }
        }catch(Exception e) {};
    }
}
