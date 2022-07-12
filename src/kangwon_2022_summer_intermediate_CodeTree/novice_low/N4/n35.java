package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n35 {
    public static void main(String[] args) {
        int read = new Scanner(System.in).nextInt();
        if(read<=2){
            System.out.println("Winter");
        }else if(read <=5){
            System.out.println("Spring");
        }else if(read <=8){
            System.out.println("Summer");
        }else if(read <=11){
            System.out.println("Fall");
        }else {
            System.out.println("Winter");
        }
    }
}
