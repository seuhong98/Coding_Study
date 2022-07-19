package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n9;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<>();
        String read[]=  br.readLine().split(" ");
        int n = Integer.parseInt(read[0]);
        int t = Integer.parseInt(read[1]);
        for(int i=0;i<3;i++){
            String temp[] = br.readLine().split(" ");
            for(String tt:temp){
                deque.add(Integer.parseInt(tt));
            }
        }
        for(int i=0;i<t;i++){
            deque.addFirst(deque.peekLast());
            deque.removeLast();
        }
        for(int i=0;i<3;i++){
            for(int k=0;k<n;k++){
                bw.write(deque.pop()+" ");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
