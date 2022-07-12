package kangwon_2022_summer_intermediate_CodeTree.novice_low.N7;

import java.io.*;

public class n29 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int array[] = new int[Integer.parseInt(br.readLine())];
        String[] read = br.readLine().split(" ");
        for(int i=0;i<array.length;i++){
            array[i] = Integer.parseInt(read[i]);
        }
        int where = array.length;
        while (where!=0){
            int max = 0;
            int w=0;
            for(int i=0;i<where;i++){
                if(max<array[i]){
                    max = array[i];
                    w=i;
                }
            }
            where = w;
            bw.write(w+1+" ");
        }
        bw.close();
    }
}
