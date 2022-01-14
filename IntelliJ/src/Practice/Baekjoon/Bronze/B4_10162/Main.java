package Practice.Baekjoon.Bronze.B4_10162;

import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a; int b; int c;
        int T = sc.nextInt();
        if(T%10==0){
            T=T/10;
            a = T/30;
            b= (T%30)/6;
            c=(T%30)%6;
            System.out.println(a+" "+b+" "+c);
        }else{
            System.out.println(-1);
        }
    }
}
