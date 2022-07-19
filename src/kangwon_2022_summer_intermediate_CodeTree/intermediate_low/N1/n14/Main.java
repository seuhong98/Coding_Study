package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n14;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        List<Integer> array = new LinkedList<>();
        for(int i=0;i<loop;i++){
            array.add(Integer.parseInt(br.readLine()));
        }
        String del[][] = new String[2][2];
        for(int i=0;i<2;i++){
            del[i] = br.readLine().split(" ");
        }
        for(int i=0;i<2;i++){
            int dCount = Integer.parseInt(del[i][1])-Integer.parseInt(del[i][0])+1;
            for(int k=0;k<dCount;k++){
                array.remove(Integer.parseInt(del[i][0])-1);
            }
        }
        System.out.println(array.size());
        for(int i:array){
            System.out.println(i);
        }




    }
}