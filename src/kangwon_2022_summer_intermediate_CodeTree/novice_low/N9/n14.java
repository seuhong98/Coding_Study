package kangwon_2022_summer_intermediate_CodeTree.novice_low.N9;

import java.io.*;

public class n14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char read = br.readLine().charAt(0);
        if(read == 'a'){
            System.out.println("z");
        }else {
            System.out.println((char)(read-1));
        }

    }
}
