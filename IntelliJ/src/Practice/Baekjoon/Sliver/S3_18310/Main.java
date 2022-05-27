package Practice.Baekjoon.Sliver.S3_18310;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len  = (Integer.parseInt(br.readLine())-1)/2;
        Integer[] read = Arrays.stream(br.readLine().split(" ")).map(s->Integer.parseInt(s)).toArray(Integer[]::new);
        Arrays.sort(read);
        System.out.println(read[len]);
    }
}
