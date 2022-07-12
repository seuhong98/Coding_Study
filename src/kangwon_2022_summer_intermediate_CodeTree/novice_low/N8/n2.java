package kangwon_2022_summer_intermediate_CodeTree.novice_low.N8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++){
            String[] read = br.readLine().split(" ");
            for(String t : read){
                System.out.print(t.toUpperCase()+" ");
            }
            System.out.println();
        }
    }
}
