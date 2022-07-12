package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n33 {
    public static void main(String[] args) {
        int read = new Scanner(System.in).nextInt();
        System.out.print(read%3==0 || read%5==0 ? "True" : "False");
    }
}
