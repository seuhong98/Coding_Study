package Practice.Baekjoon.Sliver.S1_1052;

import java.util.*;
/**
 * 첫째 줄에 N과 K가 주어진다. N은 107보다 작거나 같은 자연수이고, K는 1,000보다 작거나 같은 자연수이다.
 * @author 신승호
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> list = new Stack<Integer>();
        int N=input.nextInt();
        int K=input.nextInt();
        int n=N;
        int howmany=0;
        int need=0;
        while(true) {
            int temp[]=findN(n);
            n=temp[1];
            list.push(temp[0]);
            howmany++;
            if(n==0) {
                break;
            }else if(n==1) {
                howmany++;
                list.push(n);
                break;
            }
        }
        if(howmany>K) {
            while(howmany>K) {
                int temp=list.pop();
                int ttemp =list.pop();
                int sub=ttemp-temp;
                need += sub;
                list.push((ttemp<<1));
                howmany--;
            }
            System.out.println(need);
        }else {
            System.out.println("0");
        }
    }
    public static int[] findN(int N) {
        int top =2;
        int num[] =  new int[2];
        while(top<N) {
            top = top<<1;
        }
        top = top>>1;
        num[0]=top;
        num[1]=N-top;
        return num;
    }

}
