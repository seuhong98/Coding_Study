package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n16 {
    public static void main(String[] args) {
        String read = new Scanner(System.in).next();

        switch (read){
            case "S" :
                System.out.println("Superior");
                break;
            case "A":
                System.out.println("Excellent");
                break;
            case  "B" :
                System.out.println("Good");
                break;
            case "C" :
                System.out.println("Usually");
                break;
            case "D" :
                System.out.println("Effort");
                break;
            default:
                System.out.println("Failure");

        }
    }
}
