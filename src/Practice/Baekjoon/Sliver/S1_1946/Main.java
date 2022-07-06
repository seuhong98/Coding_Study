package Practice.Baekjoon.Sliver.S1_1946;


import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loop = LoopCount(br);
        for(int l=0;l<loop;l++){
            int answer =1;
            Integer[] rank = readRank(br);
            int examRank = rank[0];
            for(int r =1;r<rank.length;r++){
                boolean check =true;
                if(rank[r]<examRank){
                    answer++;
                    examRank = rank[r];
                }
            }
            bw.write(answer+"\n");
        }
        bw.close();
    }



    public static Integer[] readRank(BufferedReader br){
        try {
            Integer get[] = new Integer[Integer.parseInt(br.readLine())];
            for(int i=0;i<get.length;i++){
                Integer[] each = Arrays.stream(br.readLine().split(" ")).map(s->Integer.parseInt(s)).toArray(Integer[]::new);
                get[each[0]-1] = each[1];
            }
            return get;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static Integer LoopCount(BufferedReader br){
        try {
            return Integer.parseInt(br.readLine());
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
