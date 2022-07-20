package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n36;

import java.io.*;

public class Main {
    static int answer = 0;
    static int len;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        len = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        findAnswer();
        System.out.println(answer);
    }

    public static void findAnswer() {
        int mylen = sb.length();
        if(mylen==len){
            answer++;
        }else if(mylen<len){
            for(int i=1;i<=4;i++){
                for(int k=0;k<i;k++){
                    sb.append(i);
                }
                findAnswer();
                sb.setLength(mylen);
            }
        }
    }
}
