package kangwon_2022_summer_intermediate_CodeTree.novice_low.N7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class n2 {
    public static void main(String[] args) throws IOException {
       String [] read = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
       for(int i = read.length-1 ;i>=0; i--){
           System.out.print(read[i]);
       }
    }
}
