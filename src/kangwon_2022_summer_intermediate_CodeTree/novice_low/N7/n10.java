package kangwon_2022_summer_intermediate_CodeTree.novice_low.N7;

import java.io.*;
import java.util.Stack;

public class n10 {
    public static void main(String[] args) throws IOException {
        Stack<String> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        String read[]  = br.readLine().split(" ");
        for(String temp : read){
            int get = Integer.parseInt(temp);
            if(get%2==0){
                stack.push(temp +" ");
            }
        }
        while (!stack.empty()){
            bw.write(stack.pop());
        }
        bw.close();
    }
}
