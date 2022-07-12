package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n44 {
    public static void main(String[] args) throws IOException {
        Integer[] read = Arrays.stream(new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ")).map(s -> Integer.parseInt(s)).toArray(Integer[] :: new);
        Arrays.sort(read);
        System.out.println(read[1]);
    }
}
