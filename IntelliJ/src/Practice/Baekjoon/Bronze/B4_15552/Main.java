package Practice.Baekjoon.Bronze.B4_15552;


import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int howmany = Integer.parseInt(input);
        for(int i=0;i<howmany;i++) {
            input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            bw.write(String.valueOf(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        bw.flush();
        bw.close();


    }
}
