package kangwon_2022_summer_intermediate_CodeTree.FinalTest.n2;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[2];
        int[] array2 = new int[2];
        String t[] = br.readLine().split(" ");
        for(int i=0;i<2;i++){
            array[i] = Integer.parseInt(t[i]);
        }
        t = br.readLine().split(" ");
        for(int i=0;i<2;i++){
            array2[i] = Integer.parseInt(t[i]);
        }
        if(array[0]==array2[0] && array[1]==array2[0]){
            System.out.println(array[1]-array[0]);
            //System.out.println("같음");
        }else if(array[0]<= array2[0] && array[1]>= array2[1]){
            System.out.println(array[1]-array[0]);
            //System.out.println("2번째가 안에 들어있음");
        }else if(array[0]>= array2[0] && array[1]<= array2[1]){
            System.out.println(array2[1]-array2[0]);
            //System.out.println("1번째가 안에 들어가있음");
        }else if(array[1]>= array2[0] && array[0]<=array2[0]){
            System.out.println(array2[1]-array[0]);
            //System.out.println("겹치는데 2번째가 앞에");
        }else if(array2[1]>= array[0] && array2[0]<=array[0]){
            System.out.println(array[1]-array2[0]);
            //System.out.println("겹치는데 첫번째가 앞에");
        }else{
            System.out.println(array[1]-array[0] + array2[1]-array2[0]);
            //System.out.println("안겹침");
        }


    }
}
