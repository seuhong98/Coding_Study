package kangwon_2022_summer_intermediate_CodeTree.novice_mid.N5.n5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input[] = br.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int colum = Integer.parseInt(input[1]);
        int array[][] = new int[row][colum];
        boolean use[][] = new boolean[row][colum];
        int count =1;
        int x=0,y=-1;

        //0:동쪽 1:남쪽 2:서쪽 3:북쪽
        int r[] = {0,1,0,-1};
        int c[] = {1,0,-1,0};
        int rotation=0;

        boolean chance = true;

        loop:
        while (true){
            try{
                if(!use[x+r[rotation]][y+c[rotation]]){
                    use[x+r[rotation]][y+c[rotation]] = true;
                    x+=r[rotation];
                    y+=c[rotation];
                    array[x][y] = count;
                    count++;
                    chance = true;
                }else{
                    throw new Exception("e");
                }
            }catch (Exception e){
                if(chance){
                    chance = false;
                }else {
                    break loop;
                }
                rotation = (rotation+1)%4;
            }
        }

        for(int i=0;i<row;i++){
            for(int k=0;k<colum;k++){
                bw.write(array[i][k]+" ");
            }
            bw.write("\n");
        }
        bw.close();
    }
}

