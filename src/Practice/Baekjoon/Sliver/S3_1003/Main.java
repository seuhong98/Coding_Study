package Practice.Baekjoon.Sliver.S3_1003;

import java.io.*;
public class Main {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer[][]=new int[Integer.parseInt(input)][2];
        for(int doing=0;doing<answer.length;doing++) {
            input = br.readLine();
            int Ninput=Integer.parseInt(input);
            int temp[]=fibo(Ninput);
            answer[doing]=temp.clone();
        }
        for(int i=0;i<answer.length;i++) {
            System.out.println(answer[i][0]+" "+answer[i][1]);
        }
    }
    public static int[] fibo(int n) {
        int book[][]= {{1,0},{0,1},{1,1}};

        int answer[]=new int[2];
        if(n<3) {
            return book[n];
        }else {
            int temp[]= {0,1};
            answer=book[2].clone();
            for(int i=3;i<=n;i++) {
                int ttemp[]=answer.clone();
                answer[0]+=temp[0];
                answer[1]+=temp[1];
                temp=ttemp.clone();
            }
            return answer;
        }
    }

}
