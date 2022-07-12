package kangwon_2022_summer_intermediate_CodeTree.novice_low.N7;

import java.io.*;
import java.util.StringTokenizer;

public class n17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int back = Integer.parseInt(str.nextToken());
        int pre = Integer.parseInt(str.nextToken());
        bw.write(back+" ");
        bw.write(pre+" ");
        for(int i=0;i<8;i++){
            int temp = back*2+pre;
            bw.write(temp+" ");
            back = pre;
            pre = temp;
        }
        bw.close();
    }
}
