package kangwon_2022_summer_intermediate_CodeTree.novice_mid.N5.n3;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        // 0: 동 1: 남 2: 서 3: 북
        int row[] = {0,1,0,-1}; //행
        int colum[] = {1,0,-1,0}; //열
        int answer = 0;
        int loop = Integer.parseInt(br.readLine());
        boolean[][] array = new boolean[loop][loop];
        for(int i=0;i<loop;i++){
            String read[] = br.readLine().split(" ");
            for(int k=0;k<loop;k++){
                array[i][k] = read[k].equals("1");
            }
        }
        //입력 완료
        for(int i=0;i<loop;i++){
            for(int k=0;k<loop;k++){
                int count = 0;
                for(int l=0;l<4;l++){
                    try {
                        if(array[i+row[l]][k+colum[l]]){
                            count++;
                        }
                    }catch (Exception e){}
                }
                if(count>2){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}

