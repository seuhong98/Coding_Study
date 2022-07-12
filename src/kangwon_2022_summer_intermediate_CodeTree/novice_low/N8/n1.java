package kangwon_2022_summer_intermediate_CodeTree.novice_low.N8;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2차원 배열을 구현합니다.
        int[][] arr2d = new int[4][4];

        // 각 줄마다 정수를 입력받습니다.
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        // 각 줄의 합을 출력합니다.
        for(int i = 0; i < 4; i++) {
            int sum = 0;
            for(int j = 0; j < 4; j++) {
                sum += arr2d[i][j];
            }
            System.out.println(sum);
        }
    }
}