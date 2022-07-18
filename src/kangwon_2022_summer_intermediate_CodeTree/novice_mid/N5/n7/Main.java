package kangwon_2022_summer_intermediate_CodeTree.novice_mid.N5.n7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char read[] = br.readLine().toCharArray();
        //0:동쪽 1:남쪽 2:서쪽 3:북쪽
        int r[] = {0,-1,0,1};
        int c[] = {1,0,-1,0};
        int x=0,y=0;
        int rotation = 3;
        int count=0;
        boolean check = true;
        for(char t : read){
            count++;
            if(t=='R'){
                rotation = (rotation + 1)%4;
            }else if(t=='L'){
                rotation = (rotation + 3)%4;
            }else{
                x += c[rotation];
                y += r[rotation];
                if(x==0 && y==0){
                    check = false;
                    System.out.println(count);
                    break;
                }
            }
        }
        if(check){
            System.out.println(-1);        }
    }
}

