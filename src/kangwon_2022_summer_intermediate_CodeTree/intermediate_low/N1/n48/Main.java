package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n48;

import java.io.*;

public class Main {
    static int N; //0이 아닌 정수의 개수
    static int m; //뽑아야 하는 정수의 개수

    static int array[];

    static int answer =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        N = Integer.parseInt(temp[0]);
        m = Integer.parseInt(temp[1]);
        array = new int[N];
        temp = br.readLine().split(" ");
        for(int i=0;i<N;i++){
            array[i] = Integer.parseInt(temp[i]);
        }
        for(int i=1;i<=N;i++){
            findAnswer(1,i+1,array[i-1]);
        }
        System.out.println(answer);
    }

    public static void findAnswer(int now,int start,int me){
        if(now==m){
            if(answer<me){
                answer=me;
            }
        }else{
            for(int i=start;i<=N;i++){
                findAnswer(now+1,i+1,me^array[i-1]);
            }
        }
    }
}
