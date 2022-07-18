package kangwon_2022_summer_intermediate_CodeTree.novice_low.N9;

import java.io.*;

public class n9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = br.readLine();
        System.out.println(read.replace(read.charAt(1),read.charAt(0)));
    }
}
