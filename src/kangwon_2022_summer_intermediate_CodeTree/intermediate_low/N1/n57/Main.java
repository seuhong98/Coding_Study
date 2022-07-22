package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n57;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int n;
    static int m;
    static boolean array[][];
    static int answer = 0;
    static int Y[]={1,0,-1,0};
    static int X[]={0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read[] = br.readLine().split(" ");
        n = Integer.parseInt(read[0]);
        m = Integer.parseInt(read[1]);
        array=new boolean[n][m];
        for(int i=0;i<n;i++){
            read = br.readLine().split(" ");
            for(int j=0;j<m;j++){
                array[i][j] = read[j].charAt(0)=='1';
            }
        }
        array[0][0]= false;
        Queue<int[]> queue = new LinkedList<>();
        int main[];
        queue.add(new int[]{0, 0});
        start:
        while (true){
            if(queue.isEmpty()){
               break;
            }
            main = queue.poll();
            for(int i=0;i<4;i++){
                try {
                    if((main[0]+Y[i] == (n-1)) && (main[1]+X[i] == (m-1))){
                        answer=1;
                        break start;
                    }else{
                        if(array[(main[0]+Y[i])][main[1]+X[i]]){
                            array[(main[0]+Y[i])][main[1]+X[i]] = false;
                            queue.add(new int[]{(main[0]+Y[i]), main[1]+X[i]});
                        }
                    }
                }catch (Exception e){}
            }
        }
        System.out.println(answer);
    }
}
