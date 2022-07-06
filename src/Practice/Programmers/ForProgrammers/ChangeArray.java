package Practice.Programmers.ForProgrammers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChangeArray {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println(br.readLine().replace('[','{').replace(']','}'));
        }catch (Exception e){}
    }
}
