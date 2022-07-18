package kangwon_2022_summer_intermediate_CodeTree.novice_mid.N5.n2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int rotation = 3;
        int x =0,y=0;
        // 0: 동 1: 남 2: 서 3: 북
        int dx[] = {1,0,-1,0};
        int dy[] = {0,-1,0,1};
        String read[] = br.readLine().split("");
        for(String r:read){
            if(r.equals("L")){
                rotation--;
            }else if (r.equals("R")) {
                rotation++;
            }else{
                int temp = rotation%4;
                if(temp<0){
                    temp+=4;
                }
                x+=dx[temp];
                y+=dy[temp];
            }
        }
        System.out.println(x+" "+y);
    }
}
