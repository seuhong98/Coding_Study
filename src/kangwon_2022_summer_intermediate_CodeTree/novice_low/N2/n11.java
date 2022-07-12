package kangwon_2022_summer_intermediate_CodeTree.novice_low.N2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class n11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read[] = br.readLine().split(" ");
        System.out.println(read[0] +" "+read[1] + " " + (Integer.parseInt(read[0]) + Integer.parseInt(read[1])));
    }
}
