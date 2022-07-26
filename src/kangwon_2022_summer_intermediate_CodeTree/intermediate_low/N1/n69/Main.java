package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n69;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        if(m>2){
            int array[] = new int[m];
            array[0]=1;
            array[1]=1;
            for(int i=2;i<m;i++){
                array[i] = array[i-1]+array[i-2];
            }
            System.out.println(array[m-1]);
        }else {
            System.out.println(1);
        }
    }
}
