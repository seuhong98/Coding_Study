package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n28;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        int n=Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);
        int time = Integer.parseInt(t[2]);

        //상하좌우
        int y[]={-1,1,0,0};
        int x[]={0,0,-1,1};

        int[][] array = new int[n][n];
        int[][] marble = new int[n][n];

        for(int i=0;i<n;i++){
            String[] tt= br.readLine().split(" ");
            for(int k=0;k<n;k++){
                array[i][k] = Integer.parseInt(tt[k]);
            }
        }

        for(int i=0;i<m;i++){
            String tt[] = br.readLine().split(" ");
            marble[Integer.parseInt(tt[0])-1][Integer.parseInt(tt[1])-1]=1;
        }

        for(int i=0;i<time;i++){
            int[][] newMarble = new int[n][n];
            for(int k=0;k<n;k++){
                for(int l=0;l<n;l++){
                    if(marble[k][l]==1){
                        int big=0;
                        int rotation=-1;
                        for(int j=0;j<4;j++){
                            try{
                                if(big<array[k+y[j]][l+x[j]]){
                                    big=array[k+y[j]][l+x[j]];
                                    rotation=j;
                                }
                            }catch (Exception e){}
                        }
                        newMarble[k+y[rotation]][l+x[rotation]]+=1;
                    }
                }
            }
            for(int k=0;k<n;k++){
                for(int l=0;l<n;l++){
                    if(newMarble[k][l]>1){
                        m-=newMarble[k][l];
                        newMarble[k][l]=0;
                    }
                }
            }
            marble = newMarble;
        }
        System.out.println(m);
    }
}
