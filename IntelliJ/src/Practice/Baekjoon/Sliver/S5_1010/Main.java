package Practice.Baekjoon.Sliver.S5_1010;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int doo=in.nextInt();
        int answer[]=new int[doo];
        for(doo--;doo>=0;doo--) {
            int left=in.nextInt();
            int right=in.nextInt();
            int book[]=new int[left*100+right+1];
            for(int i=1;i<=right;i++) {
                book[100+i]=i;
            }
            for(int i=2;i<=left;i++) {
                for(int k=1;k<=right;k++) {
                    int temp=0;
                    for(int j=1;j<k;j++) {
                        temp +=book[(i-1)*100+j];
                    }
                    book[i*100+k]=temp;
                }
            }
            answer[doo]=book[left*100+right];
        }


        for(int i=answer.length-1;i>=0;i--) {
            System.out.println(answer[i]);
        }
    }
}

