package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n;

        // 입력
        n = sc.nextInt();

        // 출력
        if(n == 2)
            System.out.println("28");
        else if(n <= 7) {
            if(n % 2 == 1)
                System.out.println("31");
            else
                System.out.println("30");
        }
        else {
            if(n % 2 == 0)
                System.out.println("31");
            else
                System.out.println("30");
        }
    }
}