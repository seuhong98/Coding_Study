package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        System.out.println(Math.abs(Integer.parseInt(str.nextToken())-Integer.parseInt(str.nextToken())));
    }
}
