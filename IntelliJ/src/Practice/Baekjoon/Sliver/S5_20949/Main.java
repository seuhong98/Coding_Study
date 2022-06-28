package Practice.Baekjoon.Sliver.S5_20949;

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int how=Integer.parseInt(input);
        double answer[]=new double[how];
        for(int i=0;i<how;i++) {
            input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            answer[i]=Math.sqrt(Math.pow(Integer.parseInt(st.nextToken()), 2)+Math.pow(Integer.parseInt(st.nextToken()), 2))/77;
        }
        double sort[]=answer.clone();
        Arrays.parallelSort(sort);
        for(int i=how-1;i>=0;i--) {
            for(int j=0;j<how;j++) {
                if(sort[i]==answer[j]) {
                    bw.write(String.valueOf(j+1)+"\n");
                    answer[j]=-1;
                    break;
                }
            }
        }
        bw.flush();
    }
}

