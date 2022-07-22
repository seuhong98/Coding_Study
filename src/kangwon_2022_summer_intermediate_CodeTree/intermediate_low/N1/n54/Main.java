package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n54;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int n;
    static boolean[][] array;
    static int Y[]={1,0,-1,0};
    static int X[]={0,1,0,-1};
    static int answer =0;
    static int village=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        array = new boolean[n][n];
        for(int i=0;i<n;i++){
            String t[] = br.readLine().split(" ");
            for(int k=0;k<n;k++){
                array[i][k] = t[k].charAt(0)=='1';
            }
        }
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                if(array[i][k]){
                    answer++;
                    village=0;
                    findAnswer(i,k);
                    a.add(village);
                }
            }
        }
        bw.write(answer+"\n");
        Collections.sort(a);
        for(int i:a){
            bw.write(i+"\n");
        }
        bw.close();
    }
    public static void findAnswer(int y,int x){
        array[y][x] = false;
        village++;
        for(int i=0;i<4;i++){
            try {
                if(array[y+Y[i]][x+X[i]]){
                    findAnswer(y+Y[i],x+X[i]);
                }
            }catch (Exception e){}
        }
    }
}
