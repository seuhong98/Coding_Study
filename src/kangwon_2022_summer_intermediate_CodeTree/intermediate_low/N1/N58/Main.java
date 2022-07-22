package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.N58;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        array=new boolean[n][n];
        for(int i=0;i<n;i++){
            read = br.readLine().split(" ");
            for(int j=0;j<n;j++){
                array[i][j] = read[j].charAt(0)=='0';
            }
        }
        for(int i=0;i<m;i++){
            read = br.readLine().split(" ");
            findAnswer(Integer.parseInt(read[0])-1,Integer.parseInt(read[1])-1);
        }
        System.out.println(answer);
    }

    public static void findAnswer(int y,int x) {
        Queue<int[]> queue = new LinkedList<>();
        int main[];
        if(array[y][x]){
            queue.add(new int[]{y, x});
            array[y][x]=false;
            answer++;
        }
        start:
        while (true){
            if(queue.isEmpty()){
                break;
            }
            main = queue.poll();
            for(int i=0;i<4;i++){
                try {
                    if(array[(main[0]+Y[i])][main[1]+X[i]]){
                        array[(main[0]+Y[i])][main[1]+X[i]] = false;
                        queue.add(new int[]{(main[0]+Y[i]), main[1]+X[i]});
                        answer++;
                    }
                }catch (Exception e){}
            }
        }
    }
}
