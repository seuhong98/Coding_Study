package kangwon_2022_summer_intermediate_CodeTree.novice_low.N3;

import java.io.*;
import java.util.Arrays;


public class n6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" ");
        System.out.println(Integer.parseInt(a[0])+Integer.parseInt(a[1]) +" "+(Integer.parseInt(a[0])+Integer.parseInt(a[1])+Integer.parseInt(a[1])));
    }
}
