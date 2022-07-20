package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n43;

import java.io.*;
import java.util.Arrays;

public class Main {
    static int turn; //턴수
    static int len; //보드 길이
    static int token; //말의 개수
    static int array[];
    static int answer=0;
    static int use[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read[] = br.readLine().split(" ");
        turn = Integer.parseInt(read[0]);
        len = Integer.parseInt(read[1]);
        token = Integer.parseInt(read[2]);
        array = new int[turn];
        use = new int[token];
        read = br.readLine().split(" ");
        for(int i=0;i<turn;i++){
            array[i] = Integer.parseInt(read[i]);
        }
        findAnswer(0);
        System.out.println(answer);

    }

    public static void findAnswer(int now){
        if(now == turn){
            int temp=0;
            for(int i :use){
                if(i>=(len-1)){
                    temp++;
                }
            }
            if(temp>answer){
                answer =temp;
            }
        }else{
            for(int i=0;i<token;i++){
                use[i] +=array[now];
                findAnswer(now+1);
                use[i] -=array[now];
            }
        }
    }
}
