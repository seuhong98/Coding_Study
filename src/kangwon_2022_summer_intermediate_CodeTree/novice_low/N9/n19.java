package kangwon_2022_summer_intermediate_CodeTree.novice_low.N9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        String compare = br.readLine();
        boolean check = true;
        for(int i=1;i<sb.length();i++){
            if(compare.equals(sb.substring(sb.length()-i,sb.length())+sb.substring(0,sb.length()-i))){
                check = false;
                System.out.println(i);
                break;
            }
        }
        if(check){
            System.out.println(-1);
        }
    }
}
