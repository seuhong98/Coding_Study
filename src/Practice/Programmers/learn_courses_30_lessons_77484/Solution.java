package Practice.Programmers.learn_courses_30_lessons_77484;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    //테스트용 메인
    public static void main(String[] args) {

    }

    //실제 제출 코드
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> win_hash = new HashSet<>();
        int zero_count =0;
        int correct = 0;

        for(int i : win_nums){
            win_hash.add(i);
        }

        for(int i : lottos){
            if(i==0){
                zero_count++;
            }else{
                if(!win_hash.add(i)){
                    correct++;
                }
            }
        }
        int[] answer = {get_rank(correct+zero_count), get_rank(correct)};
        return answer;
    }

    /**
     * 로또 등수 받아오기
     * @param correct 맞은 개수
     * @return 등수
     */
    static int get_rank(int correct){
        switch (correct){
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2:
                return 5;
            default :
                return 6;
        }
    }
}
