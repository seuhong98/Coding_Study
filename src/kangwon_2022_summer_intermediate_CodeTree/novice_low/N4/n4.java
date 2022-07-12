package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int read = sc.nextInt();
        System.out.println(read>=5? read*read : read*read+"\ntiny");
    }
}
