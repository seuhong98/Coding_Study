package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n17 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        System.out.println(a >= 3000 ? "book" : a>=1000 ? "mask": a>=500 ? "pen": "no");
    }
}
