package Practice.Baekjoon.Gold.G4_1034;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int N; //행
    static int M; //열
    static boolean use[];
    static Boolean arr[][];
    static int deep;
    static int top =0;

    public static void main(String args[]){
        try {Read();} catch (Exception e){e.printStackTrace();}
        for(int i = deep%2 ==0 ? 0:1;i<=M;i +=2){
            findDeep(0,i);
        }
        System.out.println(top);
    }

    //읽어오기
    public static void Read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] get_NM = br.readLine().split(" ");
        N = Integer.parseInt(get_NM[0]);
        M = Integer.parseInt(get_NM[1]);
        use = new boolean[M];
        arr = new Boolean[N][M];
        for(int i=0;i<N;i++){
            Boolean[] read = Arrays.stream(br.readLine().split("")).map(s-> s.equals("0") ? false : true).toArray(Boolean[]::new);
            arr[i] = read;
        }
        deep = Integer.parseInt(br.readLine());
    }

    //부분집합 찾기
    public static void findDeep(int myDeep, int goal_Deep){
        if(myDeep == goal_Deep){
            is_Top();
        }else{
            for(int i=0;i<M;i++){
                if(!use[i]){
                    use[i] = true;
                    findDeep((myDeep+1), goal_Deep);
                    use[i] =false;
                }
            }
        }
    }

    //개수 체크
    public static void is_Top(){
        int count = 0;
        for(int i=0;i<N;i++){
            boolean check =true;
            for(int j=0;j<M;j++){
                if(use[j] ^ arr[i][j]){
                    check = false;
                    break;
                }
            }
            if(check){
                count++;
            }
        }
        if(count > top){
            top= count;
        }
    }



}
