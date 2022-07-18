package kangwon_2022_summer_intermediate_CodeTree.novice_mid.N5.n4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tt[]= br.readLine().split(" ");
        int n = Integer.parseInt(tt[0]); // 격자 크기
        int right[] = new int[n*2];
        int left[] = new int[n*2];

        right[0] =1;
        right[1] =1;
        for(int i=2;i<=n;i++){
            right[i]=i;
            right[2*n-i+1] =i;
        }
        for(int i=1;i<=n;i++){
            left[n-i]=i;
            left[n+i-1] =i;
        }

        int time = Integer.parseInt(tt[1]);
        String tttt[] = br.readLine().split(" ");
        int x = Integer.parseInt(tttt[0]);
        int y = Integer.parseInt(tttt[1]);
        //‘U', ‘D’, ‘R’, 'L’
        if(tttt[2].equals("R")){
            int temp  = (y+time)%(2*n);
            y=right[temp];
        }else if(tttt[2].equals("L")){
            int temp  = ((n-y)+time)%(2*n);
            y=left[temp];
        }else if(tttt[2].equals("D")){
            int temp  = (x+time)%(2*n);
            x=right[temp];
        }else if(tttt[2].equals("U")){
            int temp  = ((n-x)+time)%(2*n);
            x=left[temp];
        }
        System.out.println(x+" "+y);
    }
}



