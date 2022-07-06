package Practice.Baekjoon.Sliver.S3_11501;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int stock[];

    /**
     * 입력을 받고 솔루션 실행
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int repeat= sc.nextInt();
        for(int doing =0;doing<repeat;doing++){
            stock=new int[sc.nextInt()];
            for(int i=0;i<stock.length;i++){
                stock[i]=sc.nextInt();
            }
            solution();
        }
        bw.flush();
        bw.close();
    }

    /**
     * 해별 방법
     * @throws IOException
     */
    private static void solution() throws IOException {
        long answer=0;
        int start=0;
        int top[][]=findtop();
        if(top[0][0]==-1){
            bw.write(0+"\n");
        }else{
            while (true){
                int i;
                int max=findmax(start,top);

                if(start==0){
                    i=0;
                }else{
                    i=top[0][start-1]+1;
                }
                for(;i<top[0][max];i++){
                    if(stock[i]<top[1][max]){
                        answer +=top[1][max]-stock[i];
                    }
                }
                start=max+1;
                if(max>=(top[0].length-1)){
                    bw.write(answer+"\n");
                    return;
                }
            }
        }
    }

    /**
     * 위쪽 모양 그래프(이름이 생각이 안남)
     * @return 그 위치를 찾아줌
     */
    private static int[][] findtop(){
        int qLen=0;
        Queue<Integer> q= new LinkedList<Integer>();
        for(int i=1;i<stock.length-1;i++){
            if(stock[i-1]<=stock[i]&&stock[i]>stock[i+1]){
                q.add(i);
                qLen++;
            }
        }
        if(stock[stock.length-2]<=stock[stock.length-1]){
            q.add(stock.length-1);
            qLen++;
        }
        if(qLen==0){
            int err[][] = {{-1},{-1}};
            return err;
        }

        int top[][]= new int[2][qLen];
        for(int i=0;i<qLen;i++){
            top[0][i]= q.poll();
            top[1][i]=stock[top[0][i]];
        }
        return top;
    }

    /**
     * top중에서 최댓값을 구해줌
     * @param top top배열의 최대값의 위치(top배열 기준임)
     * @return
     */
    private static int findmax(int start,int top[][]){
        int max=0;
        int temp=0;
        for(int i=start;i< top[0].length;i++){
            if(temp<top[1][i]){
                temp=top[1][i];
                max=i;
            }
        }
        return max;
    }



}
