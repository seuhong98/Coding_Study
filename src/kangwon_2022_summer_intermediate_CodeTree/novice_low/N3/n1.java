package kangwon_2022_summer_intermediate_CodeTree.novice_low.N3;

import java.io.*;
import java.util.Arrays;


public class n1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer[] read = Arrays.stream(br.readLine().split(" ")).map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
        bw.write(read[0]+read[1]+"\n");
        bw.write(read[0]-read[1]+"\n");
        bw.write(read[0]/read[1]+"\n");
        bw.write(read[0]%read[1]+"\n");
        bw.close();
    }
}
