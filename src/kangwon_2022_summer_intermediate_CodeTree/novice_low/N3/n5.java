package kangwon_2022_summer_intermediate_CodeTree.novice_low.N3;

import java.io.*;
import java.util.Arrays;


public class n5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.parseInt(br.readLine())+87);
        String read = br.readLine();
        System.out.println(read.charAt(read.length()-1));
    }
}
