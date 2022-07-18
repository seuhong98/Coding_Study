package kangwon_2022_summer_intermediate_CodeTree.novice_low.N9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        String b = br.readLine();
        int count = 0;
        for(int i=0;i<=sb.length()-b.length();i++){
            if(sb.substring(i,i+b.length()).equals(b)){
                count++;
            }
        }
        System.out.println(count);
    }
}
