package Practice.Programmers.learn_courses_30_lessons_92334;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    //테스트용 메인
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(id_list,report,k)));
    }

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> numbering = new HashMap<>();
        HashSet<Integer>[] who_report = new HashSet[answer.length];

        for(int i=0;i<id_list.length;i++){
            numbering.put(id_list[i], i);
            who_report[i] = new HashSet<>();
        }

        for(String read : report){
            String[] get = read.split(" ");
            who_report[numbering.get(get[1])].add(numbering.get(get[0]));
        }
        for(int i=0;i< who_report.length;i++){
            if(who_report[i].size() >= k){
                for(int j : who_report[i]){
                    answer[j]++;
                }
            }
        }


        return answer;
    }


}
