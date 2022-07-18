package kangwon_2022_summer_intermediate_CodeTree.novice_low.N9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        int answer  = 0;
        for(int i=0;i<loop;i++){
            answer += Integer.parseInt(br.readLine());
        }
        StringBuilder sb= new StringBuilder(Integer.toString(answer));
        System.out.println(sb.substring(1)+sb.substring(0,1));
    }
}
