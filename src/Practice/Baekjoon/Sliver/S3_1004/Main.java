package Practice.Baekjoon.Sliver.S3_1004;

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer[]=new int[Integer.parseInt(input)];
        for(int doing=0;doing<answer.length;doing++) {
            input = br.readLine();
            String Sin[]=input.split(" ");
            int s[]= {Integer.parseInt(Sin[0]),Integer.parseInt(Sin[1])};
            int f[]= {Integer.parseInt(Sin[2]),Integer.parseInt(Sin[3])};
            input = br.readLine();
            int how=Integer.parseInt(input);
            for(int again=0;again<how;again++) {
                input = br.readLine();
                String t[]=input.split(" ");
                int temp[]=new int[t.length];
                for(int i=0;i<t.length;i++) {
                    temp[i]=Integer.parseInt(t[i]);
                }
                double sd=Math.sqrt(Math.pow((s[0]-temp[0]),2)+Math.pow((s[1]-temp[1]),2)); //시작점과 행성 중점과의 거리
                double fd=Math.sqrt(Math.pow((f[0]-temp[0]),2)+Math.pow((f[1]-temp[1]),2)); //도착정과 행성 중점과의 거리
                if(!(sd<=temp[2]&&fd<=temp[2])) { //둘다 작으면 둘다 원안에 있는거라 굳이 계산할 필요 없다
                    if(sd<=temp[2]) {
                        answer[doing]++;
                    }
                    if(fd<=temp[2]) {
                        answer[doing]++;
                    }
                }

            }
        }
        for(int i=0;i<answer.length;i++) {
            System.out.println(answer[i]);
        }
    }


}
