package Practice.Baekjoon.Bronze.B5_1330;

import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b = in.nextInt();
        if(a==b) {
            System.out.println("==");
        }else if(a>b) {
            System.out.println(">");
        }else {
            System.out.println("<");
        }
    }
}


