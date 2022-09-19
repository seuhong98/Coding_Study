package kangwon_2022_summer_intermediate_CodeTree.FinalTest.n3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len= Integer.parseInt(br.readLine());
        boolean[][] array = new boolean[len][len];
        for(int i=0;i<len;i++){
            String t[] = br.readLine().split(" ");
            for(int k=0;k<len;k++){
                array[i][k] = t[k].charAt(0)=='1';
            }
        }
        int answer = 0;
        for(int i=0;i<len;i++){
            for(int k=1;k<(len-1);k++){
                int a=0;
                for(int l=-1;l<2;l++){
                    if(array[i][k+l]){
                        a++;
                    }
                }
                if(a>answer){
                    answer=a;
                }
            }
        }
        System.out.println(answer);
    }
}
