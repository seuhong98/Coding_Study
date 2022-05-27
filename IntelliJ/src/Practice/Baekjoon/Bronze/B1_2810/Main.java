package Practice.Baekjoon.Bronze.B1_2810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int human  = Integer.parseInt(br.readLine());
        String read = br.readLine();
        read=  read.replace("S","*S*").replace("LL","*LL*").replace("**","*").replace("***","*").replace("****","*");
        char[] temp = read.toCharArray();
        int answer =0;
        for(char t : temp){
            if(t == '*'){
                answer++;
            }
        }
        if(answer>human){
            System.out.println(human);
        }else{
            System.out.println(answer);
        }
    }
}
