package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n71;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int array[][] = new int[n][n];
        for(int i=0;i<n;i++){
            String temp[] = br.readLine().split(" ");
            for(int j=0;j<n;j++){
                array[i][j] = Integer.parseInt(temp[j]);
            }
        }
        //입력 완료
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int top = array[i][j];
                int left = array[i][j];
                try{
                    top += array[i-1][j];
                }catch (Exception e){}
                try{
                    left += array[i][j-1];
                }catch (Exception e){}
                array[i][j] = top>left ? top:left;
            }
        }
        System.out.println(array[n-1][n-1]);
    }
}
