package kangwon_2022_summer_intermediate_CodeTree.novice_low.N7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class n32 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[Integer.parseInt(br.readLine())];
        String[] read = br.readLine().split(" ");
        for(int i=0;i<read.length;i++){
            array[i] = Integer.parseInt(read[i]);
        }
        int min = 200;
        for(int i=0;i< array.length-1;i++){
            if(min>Math.abs(array[i]- array[i+1])){
                min = Math.abs(array[i]- array[i+1]);
            }
        }
        System.out.println(min);
    }
}
