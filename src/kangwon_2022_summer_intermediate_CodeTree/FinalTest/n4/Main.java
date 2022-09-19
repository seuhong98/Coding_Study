package kangwon_2022_summer_intermediate_CodeTree.FinalTest.n4;

import java.io.*;

public class Main {
    static int[] array;
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        array = new int[n];
        String[] t = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            array[i] = Integer.parseInt(t[i]);
        }
        boolean use[]  = new boolean[n];
        findAnswer(-1000,use,0,0);
        System.out.println(answer);
    }

    public static void findAnswer(int now,boolean[] use, int deep,int me){
        if(deep==2){
            if(me>answer){
                answer = me;
            }
        }else{
            for(int i=0;i<array.length;i++){
                if((i != now-1) && (i !=now+1) && (!use[i])){
                    use[i] = true;
                    findAnswer(i,use,deep+1,me+array[i]);
                    use[i]= false;
                }
            }
        }
    }
}
