package kangwon_2022_summer_intermediate_CodeTree.novice_low.N9;

import java.io.*;

public class n10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        String read = br.readLine();

        int where = -1;
        while ((where = sb.toString().indexOf(read)) != -1 ){
            sb.delete(where,where+read.length());
        }
        System.out.println(sb.toString());
    }
}
