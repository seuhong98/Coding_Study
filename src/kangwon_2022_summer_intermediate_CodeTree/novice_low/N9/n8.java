package kangwon_2022_summer_intermediate_CodeTree.novice_low.N9;

import java.io.*;

public class n8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String read[] = br.readLine().split(" ");
        char[] sb = read[0].toCharArray();
        for(int i = 0;i<Integer.parseInt(read[1]);i++){
            String temp[] = br.readLine().split(" ");
            if(Integer.parseInt(temp[0]) == 1){
                char ttt = sb[Integer.parseInt(temp[1])-1];
                sb[Integer.parseInt(temp[1])-1] = sb[Integer.parseInt(temp[2])-1];
                sb[Integer.parseInt(temp[2])-1] = ttt;
                bw.write(new String(sb)+"\n");
            }else{
                for(int k=0;k<sb.length;k++){
                    if(sb[k] == temp[1].charAt(0)){
                        sb[k] = temp[2].charAt(0);
                    }
                }
                bw.write(new String(sb)+"\n");
            }
        }
        bw.close();
    }
}
