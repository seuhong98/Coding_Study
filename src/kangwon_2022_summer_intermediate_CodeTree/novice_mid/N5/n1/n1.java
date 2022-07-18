package kangwon_2022_summer_intermediate_CodeTree.novice_mid.N5.n1;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dx[] = {1,0,-1,0};
        int dy[] = {0,-1,0,1};
        int x = 0,y=0;
        int loop = Integer.parseInt(br.readLine());
        for(int k=0;k<loop;k++){
            String read[] = br.readLine().split(" ");
            int what = -1;
            if(read[0].equals("E")){
                what=0;
            }else if(read[0].equals("S")){
                what=1;
            }else if(read[0].equals("W")){
                what =2;
            }else{
                what = 3;
            }
            x +=dx[what]*Integer.parseInt(read[1]);
            y +=dy[what]*Integer.parseInt(read[1]);
        }
        System.out.println(x+" "+y);
    }
}

