package Practice.Baekjoon.Sliver.S4_2839;

import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int aa=n/5;
        int a=n%5;
        while(a%3 != 0) {
            if(aa<0) {
                break;
            }else {
                aa--;
                a =5+a;
            }
        }
        if(aa>=0) {
            System.out.println((a/3)+aa);
        }else {
            System.out.println(-1);
        }

    }

}
