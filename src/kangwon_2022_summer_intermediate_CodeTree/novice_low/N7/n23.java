package kangwon_2022_summer_intermediate_CodeTree.novice_low.N7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());
        int array[] = new int[a];
        int answer =0;
        while (a>1){
            array[a%b]++;
            a /=b;
        }
        for(int i=0;i<array.length;i++){
            answer+=array[i]*array[i];
        }
        System.out.println(answer);
    }
}
