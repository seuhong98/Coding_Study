package Practice.Baekjoon.Bronze.B2_1009;

import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception {
        Scanner input = new Scanner(System.in);
        int h=input.nextInt();
        int answer[]=new int[h];
        for(int howmany=0;howmany<h;howmany++) {
            LinkedList<Integer> A=new LinkedList<Integer>();
            int a=input.nextInt();
            int b=input.nextInt();
            a=a%10;
            if(a==0) {
                answer[howmany]=10;
            }else {
                int temp=a;
                A.add(temp);
                for(int i=1;i<b;i++) {
                    temp=(temp*a)%10;
                    if(A.contains(temp)) {
                        break;
                    }else {
                        A.add(temp);
                    }
                }
                answer[howmany]=A.get((b-1)%A.size());
            }

        }
        for(int i=0;i<h;i++) {
            System.out.println(answer[i]);
        }
    }
}
