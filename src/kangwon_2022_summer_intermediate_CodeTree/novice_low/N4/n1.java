package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = br.readLine();
        System.out.println(read);
        System.out.println(read.charAt(0)=='-' ? "minus" : "");
    }
}
