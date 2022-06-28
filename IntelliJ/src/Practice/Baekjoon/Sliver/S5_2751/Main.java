package Practice.Baekjoon.Sliver.S5_2751;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<Integer> mySet = new HashSet<>();
        List<Integer> myList = new ArrayList<>();

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());
        for(int i=0;i<len;i++){
            int temp = Integer.parseInt(br.readLine());
            if(!mySet.contains(temp)){
                mySet.add(temp);
                myList.add(temp);
            }
        }
        Collections.sort(myList);
        for(int i : myList){
            bw.write(i+"\n");
        }
        bw.close();
    }
}
