package Practice.Baekjoon.Gold.G4_20955;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int nu=Integer.parseInt(str.nextToken());
        int si = Integer.parseInt(str.nextToken());
        int answer=-1;
        union book[]=new union[nu+1];
        for(int ii=0;ii<si;ii++) {
            str = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(str.nextToken());
            int b=Integer.parseInt(str.nextToken());
            if(book[a]==null&&book[b]==null) {
                union temp = new union();
                union temp2 = new union();
                union next = new union();
                temp.next=next;
                temp2.next=next;
                book[a]=temp;
                book[b]=temp2;
                answer++;
                nu -=2;
            }else if(book[a]==null&&!(book[b]==null)) {
                union temp = new union();
                temp.next=book[b].next;
                book[a] = temp;
                nu--;
            }else if(book[b]==null&&!(book[a]==null)) {
                union temp = new union();
                temp.next=book[a].next;
                book[b] = temp;
                nu--;
            }else {
                union temp1 = book[a].next;
                union temp2 = book[b].next;
                while(temp1.next != null) {
                    temp1=temp1.next;
                }
                while(temp2.next != null) {
                    temp2=temp2.next;
                }
                if(temp1==temp2) {
                    answer++;
                }else {
                    union temp = new union();
                    temp1.next=temp;
                    temp2.next=temp;
                    answer--;
                }
            }

        }
        System.out.println(answer+nu);
    }
    public static class union{
        public union next = null;

    }
}
