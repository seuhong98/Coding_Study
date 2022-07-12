package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= (int)(1/Math.pow(sc.nextDouble(),2)*sc.nextInt()*10000);
        System.out.println(t>=25 ? t+"\nObesity":t);
    }
}
