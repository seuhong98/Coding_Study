package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n15;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int array[][] =new int[n][n];
        int answer[][] = new int[n][n];
        //동남서북
        int y[]={0,1,0,-1};
        int x[]={1,0,-1,0};
        for(int i=0;i<n;i++){
            String[] temp = br.readLine().split(" ");
            for(int k=0;k<n;k++){
                array[i][k] = Integer.parseInt(temp[k]);
            }
        }
        String[] last = br.readLine().split(" ");
        int BombY = Integer.parseInt(last[0])-1;
        int BombX = Integer.parseInt(last[1])-1;


        int power = array[BombY][BombX];
        for(int l=0;l<4;l++){
            for(int g=0;g<power;g++){
                try {
                    array[BombY+(y[l]*g)][BombX+(x[l]*g)]=0;
                }catch (Exception e){
                    break;
                }
            }
        }




        for(int i=0;i<n;i++){
            int w = n-1;
            for(int k=n-1;k>=0;k--){
                if(array[k][i] !=0){
                    answer[w][i] = array[k][i];
                    w--;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                bw.write(answer[i][k]+" ");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
