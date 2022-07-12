package kangwon_2022_summer_intermediate_CodeTree.novice_low.N7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n27 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String temp[] = br.readLine().split(" ");
        int read[] = new int[temp.length];
        for(int i=0;i<temp.length;i++){
            read[i] = Integer.parseInt(temp[i]);
        }
        Arrays.parallelSort(read);
        System.out.println(read[read.length-1] +" "+read[read.length-2] );
    }
}
