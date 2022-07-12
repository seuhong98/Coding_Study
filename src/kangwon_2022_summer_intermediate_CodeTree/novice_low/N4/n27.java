package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        if(a>=1 && b>=1){
            System.out.println("High");
        }else if(a>=0.5 && b>=0.5){
            System.out.println("Middle");
        }else{
            System.out.println("Low");
        }
    }
}
