package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n8;

import java.io.*;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int array[] = new int[N<<1];
        int where = (N<<1)+((0-(Integer.parseInt(temp[1])))%(N<<1));
        String t1[]= br.readLine().split(" ");
        for(int i=0;i<N;i++){
            array[i]=Integer.parseInt(t1[i]);
        }
        String t2[]= br.readLine().split(" ");
        for(int i=N;i<(N<<1);i++){
            array[i]=Integer.parseInt(t2[i-N]);
        }
        int answer[] = new int[N<<1];
        int count =0;
        for(int i=where;i<(N<<1);i++){
            answer[count]=array[i];
            count++;
        }
        for(int i=0;i<where;i++){
            answer[count]=array[i];
            count++;
        }
        for(int i=0;i<N;i++){
            bw.write(answer[i]+" ");
        }
        bw.write("\n");
        for(int i=N;i<(N<<1);i++){
            bw.write(answer[i]+" ");
        }
        bw.close();
    }
}