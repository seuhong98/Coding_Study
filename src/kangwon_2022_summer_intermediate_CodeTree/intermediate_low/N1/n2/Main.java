package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException {
        int answer =0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n=Integer.parseInt(temp[0]);
        int m=Integer.parseInt(temp[1]);
        int [][] array = new int[n][n];
        for(int i=0;i<n;i++){
            String[] t = br.readLine().split(" ");
            for(int k=0;k<n;k++){
                array[i][k] = Integer.parseInt(t[k]);
            }
        }
        for(int i=0;i<n;i++){
            int R = array[i][0];
            int C = array[0][i];
            int RR=0;
            int CC = 0;
            int RC=0;
            int CCC=0;
            boolean RB=true;
            boolean CB=true;
            for(int k=0;k<n;k++){
                if(RB){
                    if(RR==array[i][k]){
                        RC++;
                    }
                    else {
                        RR = array[i][k];
                        RC=1;
                    }
                    RB = !(RC>=m);
                    if(!RB){
                        answer++;
                    }
                }
                if(CB){
                    if(CC==array[k][i]){
                        CCC++;
                    }else{
                        CC = array[k][i];
                        CCC=1;
                    }
                    CB = !(CCC>=m);
                    if(!CB){
                        answer++;
                    }
                }
                if(!(CB||RB)){
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
