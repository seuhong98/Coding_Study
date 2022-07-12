package kangwon_2022_summer_intermediate_CodeTree.novice_low.N8;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        String[][] array= new String[n*2][m];

        for(int i=0;i<n*2;i++){
            array[i] = br.readLine().split(" ");
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(array[i][j].equals(array[i+n][j])){
                    bw.write("0 ");
                }else{
                    bw.write("1 ");
                }
            }
            bw.write("\n");
        }
        bw.close();
    }
}
