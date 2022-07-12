package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n23 {
    /**
     * a가 b보다 같거나 큰가?
     * a가 b보다 큰가?
     * b가 a보다 같거나 큰가?
     * b가 a보다 큰가?
     * a와 b가 같은가?
     * a와 b가 다른가?
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a>=b ? 1:0);
        System.out.println(a>b ? 1:0);
        System.out.println(a<=b ? 1:0);
        System.out.println(a<b ? 1:0);
        System.out.println(a==b ? 1:0);
        System.out.println(a!=b ? 1:0);
    }
}
