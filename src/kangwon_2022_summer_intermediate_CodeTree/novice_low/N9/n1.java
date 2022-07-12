package kangwon_2022_summer_intermediate_CodeTree.novice_low.N9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[3];
        array[0] = br.readLine().length();
        array[1] = br.readLine().length();
        array[2] = br.readLine().length();
        Arrays.sort(array);
        System.out.println(array[2]-array[0]);
    }
}
