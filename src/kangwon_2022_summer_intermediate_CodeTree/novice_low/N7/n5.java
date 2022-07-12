package kangwon_2022_summer_intermediate_CodeTree.novice_low.N7;

import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 실수 배열 선언
        double[] arr = new double[8];

        // 변수 선언
        double sum = 0;

        // 8개의 실수를 배열에 입력받아 저장합니다.
        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextDouble();
        }

        // 배열에 저장된 원소들의 합을 구합니다.
        for(int i = 0; i < 8; i++){
            sum += arr[i];
        }

        // sum을 출력합니다.
        System.out.printf("%.1f", sum / 8);
    }
}