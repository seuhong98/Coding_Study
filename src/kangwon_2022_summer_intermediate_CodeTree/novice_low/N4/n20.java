package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n20 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if(a%2==0){
            a =  a >> 1;
        }
        if(a%2 !=0){
            a =  (a+1) >> 1;
        }
        System.out.println( a);
    }
}
