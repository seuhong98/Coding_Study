package kangwon_2022_summer_intermediate_CodeTree.novice_low.N3;

import java.io.*;
import java.util.Arrays;


public class n2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] read = Arrays.stream(br.readLine().split(" ")).map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
        System.out.println(read[0]+8);
        System.out.println(read[1]*3);
        System.out.println((read[0]+8)*read[1]*3);
    }
}
