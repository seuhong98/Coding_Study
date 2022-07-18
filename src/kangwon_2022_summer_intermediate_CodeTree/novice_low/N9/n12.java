package kangwon_2022_summer_intermediate_CodeTree.novice_low.N9;

import java.io.*;

public class n12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String ttt[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder(ttt[0]);

        for(int i=0;i<Integer.parseInt(ttt[1]);i++){
            int t= Integer.parseInt(br.readLine());
            if(t==1){
                StringBuilder temp = new StringBuilder(sb.substring(1) + sb.substring(0,1));
                sb = temp;
                bw.write(sb.toString()+"\n");
            }else if(t==2) {
                StringBuilder temp = new StringBuilder(sb.substring(sb.length()-1) + sb.substring(0,sb.length()-1));
                sb = temp;
                bw.write(sb.toString()+"\n");
            }else {
                bw.write(sb.reverse().toString()+"\n");
            }
        }
        bw.close();
    }
}
