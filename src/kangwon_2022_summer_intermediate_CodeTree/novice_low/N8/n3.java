package kangwon_2022_summer_intermediate_CodeTree.novice_low.N8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        for(int i=0;i<5;i++){
            String[] t= br.readLine().split(" ");
            for(int j=0;j<=i;j++){
                answer += Integer.parseInt(t[j]);
            }
        }
        System.out.println(answer);
    }
}
