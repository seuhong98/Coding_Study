package Practice.Programmers.learn_courses_30_lessons_42888;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(record)));
    }

    public String[] solution(String[] record) {
        Map<String, String> final_nickname = new HashMap<>();
        List<String> process = new ArrayList<>();
        //get_final_nickname
        for(String get : record){
            String[] array = get.split(" ");
            if(array[0].equals("Enter")){
                final_nickname.put(array[1],array[2]);
                process.add(array[0]+array[1]);
            }else if(array[0].equals("Leave")){
                process.add(array[0]+array[1]);
            }else {
                final_nickname.put(array[1],array[2]);
            }
        }
        String[] answer = new String[process.size()];
        for(int i = 0;i<process.size();i++){
            if(process.get(i).substring(0,5).equals("Enter")){
                answer[i] = final_nickname.get(process.get(i).substring(5,process.get(i).length()))+"님이 들어왔습니다.";
            }else{
                answer[i] = final_nickname.get(process.get(i).substring(5,process.get(i).length()))+"님이 나갔습니다.";
            }
        }
        return answer;
    }
}
