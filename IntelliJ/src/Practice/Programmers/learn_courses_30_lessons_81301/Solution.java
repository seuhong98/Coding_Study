package Practice.Programmers.learn_courses_30_lessons_81301;

public class Solution {
    public int solution(String s) {
        return Integer.parseInt(s
                .replace("zero","0")
                .replace("one","1")
                .replace("two","2")
                .replace("three","3")
                .replace("four","4")
                .replace("five","5")
                .replace("six","6")
                .replace("seven","7")
                .replace("eight","8")
                .replace("nine","9")
        );
    }
}
