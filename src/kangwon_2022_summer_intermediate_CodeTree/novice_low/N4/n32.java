package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n32 {
    public static void main(String[] args) {
        int read = new Scanner(System.in).nextInt();
        System.out.print(read%13==0 || read%19==0 ? "True" : "False");
    }
}
