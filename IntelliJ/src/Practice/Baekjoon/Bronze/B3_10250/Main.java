package Practice.Baekjoon.Bronze.B3_10250;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loop = Integer.parseInt(br.readLine());
        for(int l = 0 ;l<loop;l++){
            Integer[] read = Arrays.stream(br.readLine().split(" ")).map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
            bw.write(( ( (((read[2]%read[0]) == 0 ? read[0] : (read[2]%read[0])) * 100)+((read[2]-1)/read[0])+1) ) + "\n");
        }
        bw.close();
    }
}

