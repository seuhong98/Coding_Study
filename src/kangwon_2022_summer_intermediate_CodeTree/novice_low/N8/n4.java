package kangwon_2022_summer_intermediate_CodeTree.novice_low.N8;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2차원 배열을 구현합니다.
        int[][] arr2d = new int[100][100];
        int cnt = 1;

        // n과 m을 입력받습니다.
        int n = sc.nextInt();
        int m = sc.nextInt();

        // n * m 크기의 배열에 숫자를 채워 넣습니다.
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                arr2d[i][j] = cnt++;

        // 숫자 직사각형을 출력합니다.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}