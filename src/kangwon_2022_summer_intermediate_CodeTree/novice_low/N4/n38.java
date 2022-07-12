package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n38 {
    public static void main(String[] args) throws IOException {
        boolean answer  = false;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str   = new StringTokenizer(br.readLine());
        answer |= (Integer.parseInt(str.nextToken()) >=19) && str.nextToken().equals("M");
        str   = new StringTokenizer(br.readLine());
        answer |= (Integer.parseInt(str.nextToken()) >=19) && str.nextToken().equals("M");
        System.out.println(answer ? 1:0);
    }
}
