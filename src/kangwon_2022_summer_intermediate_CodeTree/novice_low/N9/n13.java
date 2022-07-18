package kangwon_2022_summer_intermediate_CodeTree.novice_low.N9;

import java.io.*;

public class n13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        char[] read = br.readLine().toCharArray();
        char[] console = br.readLine().toCharArray();
        int i=0;
        for(char t : console){
            if(t == 'L') i++;
            else i--;
        }
        i = i% read.length;
        if(i<0){
            i = read.length+i;
        }
        for(int s = i;s< read.length;s++){
            bw.write(read[s]);
        }
        for (int k=0;k<i;k++){
            bw.write(read[k]);
        }
        bw.close();

    }
}
