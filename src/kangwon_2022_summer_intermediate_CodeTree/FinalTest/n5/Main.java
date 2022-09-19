package kangwon_2022_summer_intermediate_CodeTree.FinalTest.n5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int y[] = {0,1,0,-1};
        int x[] = {1,0,-1,0};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String read[] = br.readLine().split(" ");
        int n = Integer.parseInt(read[0]);
        int m = Integer.parseInt(read[1]);
        boolean[][] array = new boolean[n][n];
        for(int i=0;i<m;i++){
            read = br.readLine().split(" ");
            int yy= Integer.parseInt(read[0])-1;
            int xx= Integer.parseInt(read[1])-1;
            array[yy][xx] = true;
            int count = 0;
            for(int k=0;k<4;k++){
                try {
                    if(array[yy+y[k]][xx+x[k]]){
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
