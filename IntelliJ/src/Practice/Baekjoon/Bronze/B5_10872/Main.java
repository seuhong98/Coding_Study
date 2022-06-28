package Practice.Baekjoon.Bronze.B5_10872;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int len = new Scanner(System.in).nextInt();
        int answer = 1;
        for(; len >= 1; len--){
            answer *= len;
        }
        System.out.println(answer);
    }
}

