package kangwon_2022_summer_intermediate_CodeTree.novice_low.N7;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //과목의 개수 n을 입력받습니다.
        int n = sc.nextInt();

        // 변수 선언
        double[] arr = new double[5];
        double sum = 0;

        // 배열에 실수를 입력받아 저장합니다.
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        // 배열에 있는 실수들의 합을 구합니다.
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }

        //평균 구하기
        double avg = sum / n;

        // 출력
        System.out.printf("%.1f\n", avg);

        if(avg >= 4.0) {
            System.out.println("Perfect");
        }
        else if(avg >= 3.0) {
            System.out.println("Good");
        }
        else {
            System.out.println("Poor");
        }
    }
}