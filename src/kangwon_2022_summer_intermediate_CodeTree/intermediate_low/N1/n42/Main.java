package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n42;

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
        print(0,array,0,0);
        bw.close();
    }

    public static void print(int now,int array[],int pre,int use) throws IOException {
        if(now==N){
            for(int k:array){
                bw.write(k+" ");
            }
            bw.write("\n");
        }else{
            for(int i=1;i<=K;i++){
                if(i==pre){
                    use++;
                    if(use>=3){
                        continue;
                    }
                    array[now]=i;
                    print(now+1,array,i,use);
                }else {
                    array[now]=i;
                    print(now+1,array,i,1);
                }
            }
        }
    }
}
