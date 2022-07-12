package kangwon_2022_summer_intermediate_CodeTree.novice_low.N3;

import java.io.*;


public class n7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" ");
        System.out.printf("%.2f",(Double.parseDouble(a[0])+Double.parseDouble(a[1]))/(Double.parseDouble(a[0])-Double.parseDouble(a[1])));
    }
}
