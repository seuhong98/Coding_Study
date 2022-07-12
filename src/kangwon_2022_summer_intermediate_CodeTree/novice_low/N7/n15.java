package kangwon_2022_summer_intermediate_CodeTree.novice_low.N7;

import java.util.Scanner;

public class n15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 선언
        int[] arr = new int[100];
        int[] newArr = new int[100];
        int zero_point = 0;

        // 입력받은 정수로부터 출력할 값을 새로운 배열에 저장하고, 0이 나오면 for문을 탈출
        for(int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0) {
                zero_point = i;
                break;
            }
            if(arr[i] % 2 == 0)
                newArr[i] = arr[i] / 2;
            else
                newArr[i] = arr[i] + 3;
        }

        // 0이 나오기 전까지의 배열의 인덱스에 저장된 값을 출력
        for(int i = 0; i < zero_point; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
