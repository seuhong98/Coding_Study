package Practice.Baekjoon.Bronze.B1_1032;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int howmany = Integer.parseInt(br.readLine());
        if(howmany>1){
            char read[][] = new char[howmany][];
            for(int i=0;i<howmany;i++){
                read[i] = br.readLine().toCharArray();
            }
            for(int i=0;i<read[0].length;i++){
                char temp = read[0][i];
                boolean check = true;
                for(int j=1;j<howmany;j++){
                    if(temp != read[j][i]){
                        check = false;
                        break;
                    }
                }
                if(check){
                    bw.write(temp);
                }else{
                    bw.write("?");
                }
            }
            bw.close();
        }else {
            System.out.println(br.readLine());
        }
    }
}
