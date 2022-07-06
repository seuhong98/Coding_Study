package Practice.Programmers.learn_courses_30_lessons_42895;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    //todo : DP 아직 미구현
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(1,32000));
    }

    public int solution(int N, int number) {
        boolean is_answer =true;
        int count = 1;
        List<Integer> pre = new ArrayList<>();
        pre.add(N);

        if (N==number){
            return 1;
        }

        while (is_answer){
            count++;
            List<Integer> new_Array = new ArrayList<>();
            for(int i : pre){
                if(is_same_num(i,N)){
                    new_Array.add(i*10+N);
                }
                if(i%N==0){
                    new_Array.add(i/N);
                }
                new_Array.add(i+N);
            }

            pre = new_Array;
            for(int i: new_Array){
                if(i==number){
                    is_answer = false;
                    break;
                }
            }
        }
        return count;
    }

    static boolean is_same_num(int get, int N){
        boolean answer = true;
        String String_get = Integer.toString(get);
        char array[] = String_get.toCharArray();
        for(char i : array){
            if(i != (N+48)){
                answer = false;
                break;
            }
        }
        return answer;
    }
}
