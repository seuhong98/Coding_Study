package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n15 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        System.out.println(a >=90 ? "A" : a>=80 ? "B": a>=70 ? "C": a>=60 ? "D": "F");
    }
}
