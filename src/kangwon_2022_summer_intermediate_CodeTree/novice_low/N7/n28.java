package kangwon_2022_summer_intermediate_CodeTree.novice_low.N7;
import java.util.Scanner;

public class n28 {
    public static final int MAX_N = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int[] nums = new int[MAX_N];

        // 입력
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        // 최댓값 찾기
        int max = -1;
        for(int i = 0; i < n; i++) {
            int curr_num = nums[i];
            // 최대가 될 수 있는 후보입니다.
            if(max < curr_num) {
                // 갱신할 수 있는지 확인하기 위해 이 숫자의 등장 빈도를 셉니다.
                int count = 0;
                for(int j = 0; j < n; j++) {
                    if(nums[j] == curr_num) {
                        count++;
                    }
                }
                // 이 숫자가 배열에서 유일할때만 갱신합니다.
                if(count == 1) {
                    max = curr_num;
                }
            }
        }

        // 최댓값과 최솟값을 출력합니다.
        System.out.print(max);
    }
}
