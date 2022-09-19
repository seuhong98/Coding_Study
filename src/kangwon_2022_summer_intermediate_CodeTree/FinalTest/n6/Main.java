
package kangwon_2022_summer_intermediate_CodeTree.FinalTest.n6;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] array;
    static int n;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        array = new int[n*2];
        String read[] = br.readLine().split(" ");
        for(int i=0;i<n*2;i++){
            array[i] = Integer.parseInt(read[i]);
        }
        //입력 완료
        boolean use[] = new boolean[n*2];
        setAnswer(0,0,use);
        System.out.println(answer);
    }

    public static void setAnswer(int deep, int right,boolean use[]) {
        if(deep == n){
            for(int i=0;i<n*2;i++){
                if(!use[i]){
                    right -= array[i];
                }
            }
            if(answer>Math.abs(right)){
                answer = Math.abs(right);
            }
        }else{
            for(int i=0;i<n*2;i++){
                if(!use[i]){
                    use[i] = true;
                    setAnswer(deep+1,right+array[i],use);
                    use[i] = false;
                }
            }
        }
    }
}
