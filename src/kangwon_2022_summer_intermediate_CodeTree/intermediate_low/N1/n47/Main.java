package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n47;

import java.io.*;

public class Main {
    static int N;
    static int K;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String read[] = br.readLine().split(" ");
        K = Integer.parseInt(read[0]);
        N = Integer.parseInt(read[1]);
        int array[] = new int[N];
        boolean use[] = new boolean[K];
        print(0,array,use,1);
        bw.close();
    }

    public static void print(int now,int array[],boolean use[],int start) throws IOException {
        if(now==N){
            for(int k:array){
                bw.write(k+" ");
            }
            bw.write("\n");
        }else{
            for(int i=start;i<=K;i++){
                if(!use[i-1]){
                    use[i-1] = true;
                    array[now]=i;
                    print(now+1,array,use,i+1);
                    use[i-1]=false;
                }
            }
        }
    }
}
