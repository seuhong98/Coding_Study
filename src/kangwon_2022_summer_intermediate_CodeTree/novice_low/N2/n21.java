package kangwon_2022_summer_intermediate_CodeTree.novice_low.N2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class n21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] read = Arrays.stream(br.readLine().split(":")).map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
        System.out.println(read[0]+1+":"+read[1]);
    }
}
