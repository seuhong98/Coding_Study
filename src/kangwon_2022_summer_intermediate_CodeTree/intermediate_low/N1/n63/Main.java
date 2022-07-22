package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n63;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int n;
    static int m;
    static boolean array[][];
    static int min = 2147483646;
    static int Y[]={1,0,-1,0};
    static int X[]={0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read[] = br.readLine().split(" ");
        n = Integer.parseInt(read[0]);
        m = Integer.parseInt(read[1]);
        array= new boolean[n][m];
        for(int i=0;i<n;i++){
            read = br.readLine().split(" ");
            for(int k=0;k<m;k++){
                array[i][k] = read[k].charAt(0)=='1';
            }
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0,1});
        loop:
        while (true){
            if(queue.isEmpty()){
               break loop;
            }else{
                int temp[] = queue.poll();
                if(temp[0]==(n-1) && temp[1]==(m-1)){
                    if(temp[2]<min){
                        min=temp[2];
                    }
                    continue loop;
                }
                for(int i=0;i<4;i++){
                    try {
                        if(array[temp[0]+Y[i]][temp[1]+X[i]]){
                            queue.add(new int[]{temp[0]+Y[i],temp[1]+X[i],temp[2]+1});
                            array[temp[0]+Y[i]][temp[1]+X[i]] = false;
                        }
                    }catch (Exception e){}
                }
            }
        }
        if(min == 2147483646){
            System.out.println(-1);
        }else{
            System.out.println(min-1);
        }

    }

}
