package Practice.Baekjoon.Sliver.S1_1047;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int len;
    static int r;
    static int c;
    static int answer=0;
    public static void main(String[] args) {
        Read();
        FindAnswer(len,0,0);
        System.out.println(answer);
    }
    public static void Read(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] read = br.readLine().split(" ");
            int temp = Integer.parseInt(read[0]);
            if(temp == 1){
                len = 1;
            }else{
                len = 2 << (temp-2);
            }
            r = Integer.parseInt(read[1]);
            c = Integer.parseInt(read[2]);
        }catch (Exception e){}
    }

    /**
     * 4칸으로 나눠서 그곳에 있는지 확인하고 그 전에 있는건 단순 곱하기로 answer에 더해줌
     * @param NLen now len 새로운 변의 길이의 절반(더하기 해야하기 때문)
     * @param Nr now row 현재 row위치 시작지점을 나타낸다
     * @param Nc now colum 현재 colum의 위치 시작지점을 나타낸다
     */
    public static void FindAnswer(int NLen, int Nr, int Nc){
        boolean keep = true;
        if(NLen == 1){
            keep = false; //더이상 할 필요가 없으니까 정지(구하기 까지 하고 나서)
        }
        for(int i=0;i<4;i++){
            if(i==1 || i==3){
                Nc += NLen;
            }else if(i==2){
                Nc -= NLen;
                Nr += NLen;
            }
            if( Nr <= r && r < (Nr+NLen) && Nc <= c && c < (Nc+NLen) ){
                answer += (NLen * NLen * i);
                if(keep){
                    FindAnswer(NLen >> 1 , Nr,Nc);
                }
            }
        }

    }
}
