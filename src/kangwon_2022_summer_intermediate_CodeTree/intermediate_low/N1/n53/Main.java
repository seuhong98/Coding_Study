package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n53;

import java.io.*;
import java.util.Arrays;

public class Main {
    static int n;
    static int m;
    static boolean array[][];
    static int answer = 0;
    static int Y[]={1,0};
    static int X[]={0,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read[] = br.readLine().split(" ");
        n = Integer.parseInt(read[0]);
        m = Integer.parseInt(read[1]);
        array=new boolean[n][m];
        for(int i=0;i<n;i++){
            read = br.readLine().split(" ");
            for(int j=0;j<m;j++){
                array[i][j] = read[j].charAt(0)=='1';
            }
        }
        array[0][0]= false;
        find_answer(0,0);
        System.out.println(answer);
    }

    public static void find_answer(int y,int x){
        if(y==(n-1) && x==(m-1)){
            answer =1;
        }else{
            for(int i=0;i<2;i++){
                try{
                    if(array[y+Y[i]][x+X[i]]){
                        array[y+Y[i]][x+X[i]]=false;
                        find_answer(y+Y[i],x+X[i]);
                        if(answer ==1){
                            break;
                        }
                    }
                }catch (Exception e){}
            }
        }
    }
}
