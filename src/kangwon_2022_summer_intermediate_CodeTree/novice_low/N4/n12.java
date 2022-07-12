package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n12 {
    public static void main(String[] args) {
        double a = new Scanner(System.in).nextDouble();
        System.out.println(a >= 1 ? "High" : a>=0.5 ? "Middle": "Low");
    }
}
