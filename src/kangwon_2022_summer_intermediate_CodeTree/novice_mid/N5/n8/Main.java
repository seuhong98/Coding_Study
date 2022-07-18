package kangwon_2022_summer_intermediate_CodeTree.novice_mid.N5.n8;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //0:동쪽 1:남쪽 2:서쪽 3:북쪽
        int r[] = {0,-1,0,1};
        int c[] = {1,0,-1,0};
        String a[] = br.readLine().split(" ");
        boolean array[][] = new boolean[Integer.parseInt(a[0])][Integer.parseInt(a[0])];
        int loop = Integer.parseInt(a[1]);
        for(int i=0;i<loop;i++){
            String read[] = br.readLine().split(" ");
            int x= Integer.parseInt(read[0])-1;
            int y= Integer.parseInt(read[1])-1;
            array[x][y] = true;
            int count =0;
            for(int k=0;k<4;k++){
                try {
                    if(array[x+r[k]][y+c[k]]){
                        count++;
                    }
                }catch (Exception e){}
            }
            if(count==3){
                bw.write(1+"\n");
            }else{
                bw.write(0+"\n");
            }
        }
        bw.close();
    }
}

