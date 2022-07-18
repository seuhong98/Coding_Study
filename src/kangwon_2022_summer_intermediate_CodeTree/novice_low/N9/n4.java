package kangwon_2022_summer_intermediate_CodeTree.novice_low.N9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] read = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=1;i< read.length;i+=2){
            stack.push(read[i]);
        }
        while (!stack.empty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());


    }
}
