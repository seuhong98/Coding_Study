package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n64;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int y[] = {-2,-2,-1,1,2,2,1,-1};
        int x[] = {-1,1,2,2,1,-1,-2,-2};
        int n = Integer.parseInt(br.readLine());
        boolean[][] use = new boolean[n][n];
        String read[] = br.readLine().split(" ");
        int start[] ={Integer.parseInt(read[0])-1,Integer.parseInt(read[1])-1,0};
        int r2= Integer.parseInt(read[2])-1;
        int c2= Integer.parseInt(read[3])-1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);
        use[start[0]][start[1]]=true;
        int min = 2147483646;
        loop:
        while (true){
            if(queue.isEmpty()){
                break loop;
            }
            int info[] = queue.poll();
            if(info[0]==r2 && info[1]==c2){
                if(min>info[2]){
                    min = info[2];
                }
                continue loop;
            }
            for(int i=0;i<8;i++){
                try {
                    if(!use[info[0]+y[i]][info[1]+x[i]]){
                        use[info[0]+y[i]][info[1]+x[i]] = true;
                        queue.add(new int[]{info[0]+y[i],info[1]+x[i],info[2]+1});
                    }
                }catch (Exception e){}
            }
        }
        if(min == 2147483646){
            System.out.println(-1);
        }else{
            System.out.println(min);
        }
    }
}
