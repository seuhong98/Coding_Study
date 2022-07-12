package kangwon_2022_summer_intermediate_CodeTree.novice_low.N3;

import java.io.*;
import java.util.Arrays;


public class n3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] read = Arrays.stream(br.readLine().split(" ")).map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
        System.out.println(read[0] +" * "+read[1]+" = "+(read[0]*read[1]));
        System.out.println(read[0] +" / "+read[1]+" = "+(read[0]/read[1]));
    }
}
