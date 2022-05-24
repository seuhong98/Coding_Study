package Test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(is_same_num(2225222,2));

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
