package kangwon_2022_summer_intermediate_CodeTree.novice_low.N3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int read = Arrays.stream(br.readLine().split(" ")).map(s -> Integer.parseInt(s)).reduce((a, b) ->{return a+b;}).get();
        System.out.println(read);
        System.out.println(read/3);
        System.out.println(read-read/3);
    }
}


