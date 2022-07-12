package kangwon_2022_summer_intermediate_CodeTree.novice_low.N2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(String.format("%.1f", Double.parseDouble(br.readLine())*30.48));
    }
}
