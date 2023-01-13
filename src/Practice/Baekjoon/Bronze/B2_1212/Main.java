package Practice.Baekjoon.Bronze.B2_1212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger input = new BigInteger(br.readLine(),8);
        System.out.println(input.toString(2));
    }
}
