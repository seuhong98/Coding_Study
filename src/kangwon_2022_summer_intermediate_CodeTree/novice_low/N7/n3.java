package kangwon_2022_summer_intermediate_CodeTree.novice_low.N7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n3 {
    public static void main(String[] args) throws IOException {
        String [] read = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        int sum=0;
        int count =0;
        for(String temp : read){
            int get = Integer.parseInt(temp);
            if(get>=250){
                break;
            }else{
                sum += get;
                count++;
            }
        }
        System.out.printf("%d %.1f",sum,sum/(double)count);
    }
}
