package kangwon_2022_summer_intermediate_CodeTree.novice_low.N9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String arr[] = new String[count];
        for(int i=0;i<count;i++){
            arr[i] = br.readLine();
        }
        char t= br.readLine().charAt(0);
        int answer = 0;
        int len=0;
        for(String tt: arr){
            if(t == tt.charAt(0)){
                answer++;
                len += tt.length();
            }
        }
        System.out.printf("%d %.2f",answer,len/(double)answer);
    }
}
