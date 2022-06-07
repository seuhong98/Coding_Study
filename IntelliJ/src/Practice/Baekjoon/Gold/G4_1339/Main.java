package Practice.Baekjoon.Gold.G4_1339;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howmany = Integer.parseInt(br.readLine());
        char[][] arr = new char[howmany][];
        for(int i=0;i<howmany;i++){
            arr[i] = br.readLine().toCharArray();
        }

    }
}
