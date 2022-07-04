package Programming_Contest.UCPC2022.A;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            double read = Double.parseDouble(br.readLine());
            int answer  = (int)Math.ceil(read/4);
            for(int i=0;i<answer;i++){
                bw.write("long ");
            }
            bw.write("int");
            bw.close();
        }catch (Exception e){

        }

    }
}
