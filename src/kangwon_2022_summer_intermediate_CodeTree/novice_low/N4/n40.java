package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int y;

        // 입력
        y = sc.nextInt();

        if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}