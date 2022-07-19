package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer=0;
        int N = Integer.parseInt(br.readLine());
        String[][] array = new String[N][N];
        for(int i=0;i<N;i++){
            array[i]= br.readLine().split(" ");

        }

        for(int i=1;i<(N-1);i++){
            for(int k=1;k<(N-1);k++){
                int sum=0;
                for(int j=-1;j<=1;j++){
                    for(int l=-1;l<=1;l++){
                        if(array[i+j][k+l].equals("1")){
                            sum++;
                        }
                    }
                }
                if(sum>answer){
                    answer=sum;
                }
            }
        }
        System.out.println(answer);
    }
}
