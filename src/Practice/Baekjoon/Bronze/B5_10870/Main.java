package Practice.Baekjoon.Bronze.B5_10870;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int want = new Scanner(System.in).nextInt();
        int answer=1;
        int pre=0;

        for(int i=0;i<want-1;i++){
            int temp = answer;
            answer = temp+ pre;
            pre =temp;
        }

        if(want == 0){
            System.out.println(0);
        }else{
            System.out.println(answer);
        }
    }
}
