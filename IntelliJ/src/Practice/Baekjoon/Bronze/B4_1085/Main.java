package Practice.Baekjoon.Bronze.B4_1085;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y,w,h;
        Scanner sr = new Scanner(System.in);
        String read[] = sr.nextLine().split(" ");
        x=Integer.parseInt(read[0]); y=Integer.parseInt(read[1]); w=Integer.parseInt(read[2]); h=Integer.parseInt(read[3]);
        int answer = 500000;
        if(x<answer){
            answer =x;
        }
        if(y< answer){
            answer = y;
        }
        if(w-x < answer){
            answer = w-x;
        }
        if(h-y < answer){
            answer = h-y;
        }
        System.out.println(answer);

    }
}
