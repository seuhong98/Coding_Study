package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n70;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long howmany =1;
        for(int i=19;i>=1;i--){
            howmany *=i;
        }
        System.out.println(howmany);
    }
}
