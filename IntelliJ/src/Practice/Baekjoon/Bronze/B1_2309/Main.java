package Practice.Baekjoon.Bronze.B1_2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] input = new Integer[9];
        for(int i=0;i<9;i++){
            input[i] = Integer.parseInt(br.readLine());
        }

        int[] answer = new int[7];
        boolean use[] = new boolean[9];
        getAnswer(answer,input,use,0,0);
        Arrays.sort(answer);
        for(int i=0;i<7;i++){
            System.out.println(answer[i]);
        }
    }

    public static boolean getAnswer(int[] answer,Integer[] input,boolean[] use,int deep,int sum){
        if(deep==7){
            if(sum == 100){
                return true;
            }else{
                return false;
            }
        }else{
            if(sum>=100){
                return false;
            }
            boolean check = false;
            for(int i=0;i<9;i++){
                if(!use[i]){
                    use[i] = true;
                    answer[deep] = input[i];
                    if(getAnswer(answer,input,use,deep+1,(sum+input[i]))){
                       check = true;
                       break;
                    }else {
                        use[i] = false;
                    }
                }
            }
            return check;
        }
    }
}
