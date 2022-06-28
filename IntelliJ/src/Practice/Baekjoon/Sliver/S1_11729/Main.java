package Practice.Baekjoon.Sliver.S1_11729;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = new Scanner(System.in).nextInt();

        bw.write((int)(Math.pow(2, N) - 1)+"\n");

        Hanoi(N, 1, 2, 3);
        bw.close();

    }

    public static void Hanoi(int N, int start, int mid, int to) throws IOException {
        if (N == 1) {
            bw.write(start + " " + to + "\n");
            return;
        }
        Hanoi(N - 1, start, to, mid);
        bw.write(start + " " + to + "\n");
        Hanoi(N - 1, mid, start, to);
    }
}
