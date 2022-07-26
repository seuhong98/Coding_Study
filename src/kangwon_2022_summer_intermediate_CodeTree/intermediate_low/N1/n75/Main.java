package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n75;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int array[] = new int[len+1];
        String te[] = br.readLine().split(" ");
        for(int i=1;i<=len;i++){
            array[i] = Integer.parseInt(te[i-1]);
        }
        int answer[] = new int[len+1];
        for(int i=1;i<=len;i++){
            answer[i] = Integer.MIN_VALUE;
        }

        for(int i=1;i<len+1;i++){
            for(int j=0;j<i;j++){
                if(array[i]>array[j]){
                    answer[i] = Math.max(answer[i], answer[j] + 1);
                }
            }
        }
        int big = 0;
        for(int i=1;i<=len;i++){
            big = Math.max(big,answer[i]);
        }
        System.out.println(big);
    }
}
