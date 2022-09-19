package kangwon_2022_summer_intermediate_CodeTree.FinalTest.n1;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] read = br.readLine().split(" ");
        int[] array = new int[3];
        for(int i=0;i<3;i++){
            array[i] = Integer.parseInt(read[i]);
        }
        Arrays.sort(array);
        System.out.println(array[0]);
    }
}
