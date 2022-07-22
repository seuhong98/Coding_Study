package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n52;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Main {
    static int n;
    static int m;

    static boolean edge[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] read = br.readLine().split(" ");
        n = Integer.parseInt(read[0]);
        m = Integer.parseInt(read[1]);
        edge = new boolean[n][n];
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<m;i++){
            read = br.readLine().split(" ");
            int y= Integer.parseInt(read[0])-1;
            int x=Integer.parseInt(read[1])-1;
            edge[y][x] = true;
            edge[x][y] = true;
        }

        int main = 0;
        start:
        while (true){
            for(int i=1;i<n;i++){
                if(edge[main][i]){
                    if(!set.contains(i)){
                        stack.push(main);
                        set.add(i);
                        main=i;
                        continue start;
                    }
                }
            }
            if(stack.isEmpty()){
                break;
            }else{
                main = stack.pop();
            }
        }
        System.out.println(set.size());
    }
}
