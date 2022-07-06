package Practice.Baekjoon.Sliver.S1_2447;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    static int len;
    static boolean board[][];
    public static void main(String[] args) throws IOException {
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
        len = new Scanner(System.in).nextInt();
        board = new boolean[len][len];
        remove(0,0,len);
        for(int i=0;i<len;i++){
            for(int k=0;k<len;k++){
                if(board[i][k]){
                    bw.write(" ");
                }else{
                    bw.write("*");
                }
            }
            bw.write("\n");
        }
        bw.close();
    }

    static public void remove(int x,int y,int deep){
        if(deep != 1){
            int step = deep/3;
            for(int i=x+step;i<x+step+step;i++){
                for(int k=y+step;k<y+step+step;k++){
                    board[i][k] =true;
                }
            }
            for(int i=0;i<3;i++){
                for(int k=0;k<3;k++){
                    remove((x+(i*step)),(y+(k*step)),step);
                }
            }
        }
    }
}
