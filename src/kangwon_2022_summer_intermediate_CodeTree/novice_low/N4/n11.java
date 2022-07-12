package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n11 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        System.out.println(a < 0 ? "ice" : a>=100 ? "vapor": "water");
    }
}
