package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n21 {
    public static void main(String[] args) {
        int read = new Scanner(System.in).nextInt();
        System.out.print(read == 5 ? "A" : read%2==0 ? "B": "");
    }
}
