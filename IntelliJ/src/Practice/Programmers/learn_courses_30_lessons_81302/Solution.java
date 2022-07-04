package Practice.Programmers.learn_courses_30_lessons_81302;

import java.util.Arrays;

public class Solution {

    static boolean is_true = true;

    public static void main(String[] args) {
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        System.out.println(        Arrays.toString(new Solution().solution(places)));
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        //방마다 반복
        for(int big = 0 ; big<5 ; big ++){
            char [][] array = new char[5][5];
            boolean [][] use = new boolean[5][5];
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){

                }
            }
        }
        return answer;
    }

    public void findAnswer(char[][] array , int x, int y){

    }
}
