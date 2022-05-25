package Practice.Programmers.learn_courses_30_lessons_67256;

public class Solution {
    static int right = 11;
    static int left = 10;

    public static void main(String[] args) {
        int[] numbers = {8,8,8,8,8,8,8,8,8,8,8,8,8,8};
        Solution temp = new Solution();
        System.out.println(temp.solution(numbers,"right"));
    }



    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        for(int read : numbers){
            if(read == 1 || read == 4 || read == 7){
                sb.append("L");
                left = read;
            }else if(read == 3 || read == 6 || read == 9){
                sb.append("R");
                right = read;
            }else{
                if(hand.equals("right")){
                    if(read == right){
                        sb.append("R");
                        right = read;
                    }else if(read == left){
                        sb.append("L");
                        left = read;
                    }else{
                        sb.append(find_hand_right(read));
                    }
                }else{
                    if(read == right){
                        sb.append("R");
                        right = read;
                    }else if(read == left){
                        sb.append("L");
                        left = read;
                    }else{
                        sb.append(find_hand_left(read));
                    }
                }
            }
        }
        return sb.toString();
    }

    static String find_hand_right(int num){
        boolean temp = true;
        if(num ==2){
            if(right == 1 || right == 3 || right == 5)  {
                right = num;
                return "R";
            }else if(left == 1 || left == 3 || left == 5) {
                left = num;
                return "L";
            }else if(right == 4 || right == 8 || right == 6) {
                right = num;
                return "R";
            }else if(left == 4 || left == 8 || left == 6) {
                left = num;
                return "L";
            }else if(right == 7 || right == 0 || right == 9) {
                right = num;
                return "R";
            }else if(left == 7 || left == 0 || left == 9) {
                left = num;
                return "L";
            }else if(right == 11 || right == 10) {
                right = num;
                return "R";
            }else {
                left = num;
                return "L";
            }
        }else if(num == 5){
            if(right == 2 || right == 4 || right == 6 || right == 8) {
                right = num;
                return "R";
            }else if(left == 2 || left == 4 || left == 6 || left == 8) {
                left = num;
                return "L";
            }else if(right == 1 || right == 3 || right == 7 || right == 9 || right == 0) {
                right = num;
                return "R";
            }else if(left == 1 || left == 3 || left == 7 || left == 9 || left == 0) {
                left = num;
                return "L";
            }else if(right == 10 || right == 11) {
                right = num;
                return "R";
            }else{
                left = num;
                return "L";
            }
        }else if(num == 8){
            if(right == 5 || right == 7 || right == 9 || right == 0) {
                right = num;
                return "R";
            }else if(left == 5 || left == 7 || left == 9 || left == 0) {
                left = num;
                return "L";
            }else if(right == 4 || right == 6 || right == 2 || right == 10 || right == 11) {
                right = num;
                return "R";
            }else if(left == 4 || left == 6 || left == 2 || left == 10 || left == 11) {
                left = num;
                return "L";
            }else if(right == 1 || right == 3) {
                right = num;
                return "R";
            }else{
                left = num;
                return "L";
            }
        }else if(num == 0){
            if(right == 8 || right == 10 || right == 11) {
                right = num;
                return "R";
            }else if(left == 8 || left == 10 || left == 11) {
                left = num;
                return "L";
            }else if(right == 7 || right == 5 || right == 9) {
                right = num;
                return "R";
            }else if(left == 7 || left == 5 || left == 9) {
                left = num;
                return "L";
            }else if(right == 4 || right == 2 || right == 6) {
                right = num;
                return "R";
            }else if(left == 4 || left == 2 || left == 6) {
                left = num;
                return "L";
            }else if(right == 1 || right == 3) {
                right = num;
                return "R";
            }else{
                left = num;
                return "L";
            }
        }else{
            return "";
        }
    }

    static String find_hand_left(int num){
        boolean temp = true;
        if(num ==2){
            if(left == 1 || left == 3 || left == 5) {
                left = num;
                return "L";
            }else if(right == 1 || right == 3 || right == 5) {
                right = num;
                return "R";
            }else if(left == 4 || left == 8 || left == 6) {
                left = num;
                return "L";
            }else if(right == 4 || right == 8 || right == 6) {
                right = num;
                return "R";
            }else if(left == 7 || left == 0 || left == 9) {
                left = num;
                return "L";
            }else if(right == 7 || right == 0 || right == 9) {
                right = num;
                return "R";
            }else if(left == 11 || left == 10) {
                left = num;
                return "L";
            }else {
                right = num;
                return "R";
            }
        }else if(num == 5){
            if(left == 2 || left == 4 || left == 6 || left == 8) {
                left = num;
                return "L";
            }else if(right == 2 || right == 4 || right == 6 || right == 8) {
                right = num;
                return "R";
            }else if(left == 1 || left == 3 || left == 7 || left == 9 || left == 0) {
                left = num;
                return "L";
            }else if(right == 1 || right == 3 || right == 7 || right == 9 || right == 0) {
                right = num;
                return "R";
            }else if(left == 10 || left == 11) {
                left = num;
                return "L";
            }else{
                right = num;
                return "R";
            }
        }else if(num == 8){
            if(left == 5 || left == 7 || left == 9 || left == 0) {
                left = num;
                return "L";
            }else if(right == 5 || right == 7 || right == 9 || right == 0) {
                right = num;
                return "R";
            }else if(left == 4 || left == 6 || left == 2 || left == 10 || left == 11) {
                left = num;
                return "L";
            }else if(right == 4 || right == 6 || right == 2 || right == 10 || right == 11) {
                right = num;
                return "R";
            }else if(left == 1 || left == 3) {
                left = num;
                return "L";
            }else{
                right = num;
                return "R";
            }
        }else if(num == 0){
            if(left == 8 || left == 10 || left == 11) {
                left = num;
                return "L";
            }else if(right == 8 || right == 10 || right == 11) {
                right = num;
                return "R";
            }else if(left == 7 || left == 5 || left == 9) {
                left = num;
                return "L";
            }else if(right == 7 || right == 5 || right == 9) {
                right = num;
                return "R";
            }else if(left == 4 || left == 2 || left == 6) {
                left = num;
                return "L";
            }else if(right == 4 || right == 2 || right == 6) {
                right = num;
                return "R";
            }else if(left == 1 || left == 3) {
                left = num;
                return "L";
            }else {
                right = num;
                return "R";
            }
        }else{
            return "";
        }
    }
}
