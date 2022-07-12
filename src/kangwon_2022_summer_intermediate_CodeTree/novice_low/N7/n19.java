package kangwon_2022_summer_intermediate_CodeTree.novice_low.N7;
import java.util.Scanner;

public class n19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int[] countArr = new int[7];
        int[] arr = new int[10];

        // arr[i]를 입력받은 후 카운팅 배열을 통해 각각의 빈도 저장
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            countArr[arr[i]]++;
        }

        // 1부터 6까지 나온 횟수를 출력
        for(int i = 1; i <= 6; i++) {
            System.out.println(i + " - " + countArr[i]);
        }
    }
}
