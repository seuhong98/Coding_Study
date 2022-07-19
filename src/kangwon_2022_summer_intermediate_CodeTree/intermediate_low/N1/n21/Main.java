package kangwon_2022_summer_intermediate_CodeTree.intermediate_low.N1.n21;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<>();
        //상하좌우
        int y[]={-1,1,0,0};
        int x[]={0,0,-1,1};

        int row=0;
        int colum=0;

        String[] read = br.readLine().split(" ");
        int n = Integer.parseInt(read[0]);
        row = Integer.parseInt(read[1])-1;
        colum = Integer.parseInt(read[2])-1;

        int array[][]= new int[n][n];

        for(int i=0;i<n;i++){
            String tt[]= br.readLine().split(" ");
            for(int k=0;k<n;k++){
                array[i][k] = Integer.parseInt(tt[k]);
            }
        }
        int me = array[row][colum];
        deque.add(me);

        while (true){
            int rotation = -1;
            for(int i=0;i<4;i++){
                try {
                    if(array[row+y[i]][colum+x[i]]>me){
                        rotation=i;
                        break;
                    }
                }catch (Exception e){}
            }
            if(rotation==-1){
                break;
            }else{
                row+=y[rotation];
                colum+=x[rotation];
                me=array[row][colum];
                deque.add(me);
            }
        }
        while (!deque.isEmpty()){
            bw.write(deque.pop()+" ");
        }
        bw.close();

    }
}
