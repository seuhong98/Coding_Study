package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a<=b) && (a<=c)){
            System.out.println(a);
        }else if((b<=a) && (b<=c)){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }

}
