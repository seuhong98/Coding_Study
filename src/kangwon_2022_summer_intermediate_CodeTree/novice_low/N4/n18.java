package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int read = sc.nextInt() - sc.nextInt();
        System.out.print((read < 0 ? 1:0 )+ " "+ (read == 0 ? 1 :0));
    }
}
