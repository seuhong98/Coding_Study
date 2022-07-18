package kangwon_2022_summer_intermediate_CodeTree.novice_low.N9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char read[] = br.readLine().toCharArray();
        for(int i =0;i<read.length;i++){
            if(read[i]<=90){
                read[i] +=32;
            }else{
                read[i] -=32;
            }
        }
        System.out.println(new String(read));

    }
}
