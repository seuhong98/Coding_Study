package Practice.Baekjoon.Bronze.B3_2588;

import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(System.in);
        String temp=in.nextLine();
        int a=Integer.parseInt(temp);
        String b= in.nextLine();
        char bb[]=b.toCharArray();
        for(int i=2;i>=0;i--) {
            System.out.println(a*(bb[i]-48));
        }
        System.out.println(a*Integer.parseInt(b));
    }
}


