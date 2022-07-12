package kangwon_2022_summer_intermediate_CodeTree.novice_low.N7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n1 {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.stream(new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ")).map(s -> Integer.parseInt(s)).reduce((a,b) ->{
            return a+b;
        }).get());
    }
}
