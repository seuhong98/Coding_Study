package kangwon_2022_summer_intermediate_CodeTree.novice_mid.N5.n6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howmany = Integer.parseInt(br.readLine());
        int dic[] = new int[128];
        dic['E'] = 0; dic['S'] = 1; dic['W'] = 2; dic['N'] = 3;
        //0:동쪽 1:남쪽 2:서쪽 3:북쪽
        int r[] = {0,-1,0,1};
        int c[] = {1,0,-1,0};
        int x=0,y=0;
        boolean check = false;

        char[] dir = new char[howmany];
        int[] len = new int[howmany];
        for(int i=0;i<howmany;i++){
            String[] temp = br.readLine().split(" ");
            dir[i] = temp[0].charAt(0);
            len[i] = Integer.parseInt(temp[1]);
        }
        for(int i=0;i<howmany;i++){
            int tx = x+c[dic[dir[i]]]*len[i];
            int ty = y+r[dic[dir[i]]]*len[i];

            if(dic[dir[i]]%2 == 0){
                if(y==0 && isHome(x,tx)){
                    check = true;
                    break;
                }
            }else{
                if(x == 0 && isHome(y,ty)){
                    check = true;
                    break;
                }
            }
            x = tx;
            y = ty;
            count += len[i];
        }
        if(check){
            System.out.println(count);
        }else {
            System.out.println(-1);
        }

    }

    public static boolean isHome(int start,int end){
        if((start>0 && end<=0)){
            count += start;
            return true;
        }else if((start<0 && end>=0)){
            count += (-start);
            return true;
        }else{
            return false;
        }
    }
}

