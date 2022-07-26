package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n73;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int array[] = new int[len];
        String te[] = br.readLine().split(" ");
        for(int i=0;i<len;i++){
            array[i] = Integer.parseInt(te[i]);
        }
        for(int i=1;i<len;i++){
            if((array[i-1]+array[i])>array[i]){
                array[i] = (array[i-1]+array[i]);
            }
        }
        int big=-3000;
        for(int i=0;i<len;i++){
            if(big<array[i]){
                big =  array[i];
            }
        }
        System.out.println(big);
    }
}
