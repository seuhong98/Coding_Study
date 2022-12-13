package Practice.Baekjoon.Sliver.S4_1018;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int min = Integer.MAX_VALUE;

    static Boolean array[][];
    public static void main(String[] args) throws IOException {
        int Mx,My;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        Mx = Integer.parseInt(t[0]);
        My = Integer.parseInt(t[1]);
        array = new Boolean[Mx][My];
        for(int i=0;i<Mx;i++){
            String[] tt = br.readLine().split("");
            for(int j=0;j<tt.length;j++){
                array[i][j] = tt[j].equals("W");
            }
        }
        for(int i=0;i<(Mx-7);i++){
            for(int j=0;j<(My-7);j++){
                int count=0;
                int count2 = 0;
                boolean before = !array[i][j];
                for(int k=0;k<8;k++){
                    before = !before;
                    boolean loop = before;
                    for(int h=0;h<8;h++){
                        if(loop != array[i+k][j+h]){
                            count++;
                        }else{
                            count2++;
                        }
                        loop = !loop;
                    }
                }
                min = Math.min(Math.min(count,count2),min);
            }
        }
        System.out.println(min);
    }






}
