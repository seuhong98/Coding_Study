
package kangwon_2022_summer_intermediate_CodeTree.FinalTest.n7;

import java.io.*;
import java.util.Arrays;

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
                boolean top_can = true;
                boolean left_can = true;
                try{
                    top = array[i-1][j];
                }catch (Exception e){top_can=false;}
                try{
                    left = array[i][j-1];
                }catch (Exception e){left_can=false;}
                if(top<=array[i][j] && left<=array[i][j]){
                }else{
                    if(top_can && left_can){
                        if(top>=array[i][j] && left>=array[i][j]){
                            array[i][j] = Math.min(top,left);
                        }
                    }else if(top_can){
                        array[i][j] = top;
                    }else if(left_can) {
                        array[i][j] = left;
                    }
                }

            }
        }
        System.out.println(array[n-1][n-1]);
//        for(int i=0;i<n;i++){
//            System.out.println(Arrays.toString(array[i]));
//        }
    }
}
