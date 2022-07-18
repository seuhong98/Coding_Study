package kangwon_2022_summer_intermediate_CodeTree.novice_low.N9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int answer  = 0;

        for(int h=0;h<2;h++){
            char[] a = br.readLine().toCharArray();
            for(int i=0;i<a.length;i++){
                if(a[i]>=48 && a[i]<=57){
                    sb.append(a[i]);
                }
            }
            answer += Integer.parseInt(sb.toString());
            sb.setLength(0);
        }
        System.out.println(answer);

    }
}
