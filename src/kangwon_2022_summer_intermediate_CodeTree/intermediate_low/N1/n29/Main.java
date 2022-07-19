package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n29;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String t[] = br.readLine().split(" ");
        int n = Integer.parseInt(t[0]);
        int turn = Integer.parseInt(t[1]);
        int[][] array= new int[n][n];
        //상하좌우 상좌 상우 하좌 하우
        int y[]={-1,1,0,0,-1,-1,1,1};
        int x[]={0,0,-1,1,-1,1,-1,1};

        for(int i=0;i<n;i++){
            String tt[]= br.readLine().split(" ");
            for(int k=0;k<n;k++){
                array[i][k] = Integer.parseInt(tt[k]);
            }
        }

        for(int nowT=0;nowT<turn;nowT++){
            for(int want=1;want<=(n*n);want++){
                loop:
                for(int i=0;i<n;i++){
                    for(int k=0;k<n;k++){
                        if(array[i][k]==want){
                            int big=0;
                            int rotation=-1;
                            for(int l=0;l<8;l++){
                                try {
                                    if(array[i+y[l]][k+x[l]]>big){
                                        big=array[i+y[l]][k+x[l]];
                                        rotation=l;
                                    }
                                }catch (Exception e){}
                            }
                            array[i][k]=array[i+y[rotation]][k+x[rotation]];
                            array[i+y[rotation]][k+x[rotation]] = want;
                            break loop;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int k:array[i]){
                bw.write(k+" ");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
