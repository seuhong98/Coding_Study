package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n22;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String read[] = br.readLine().split(" ");
        int n = Integer.parseInt(read[0]);
        int len = Integer.parseInt(read[1]);
        int start = Integer.parseInt(read[2]);
        boolean[][] array = new boolean[n+1][n];
        for(int i=0;i<n;i++){
            array[n][i] =true;
        }
        for(int i=0;i<n;i++){
            String temp[] = br.readLine().split(" ");
            for(int k=0;k<n;k++){
                array[i][k]= temp[k].charAt(0)=='1';
            }
        }
        loop:
        for(int i=1;i<=n;i++){
            for(int k=start-1;k<start-1+len;k++){
                if(array[i][k]){
                    for(int g=start-1;g<start-1+len;g++){
                        array[i-1][g]=true;
                    }
                    break loop;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(boolean k:array[i]){
                bw.write((k ? 1:0 )+" ");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
