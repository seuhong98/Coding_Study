package Practice.Baekjoon.Sliver.S1_19539;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int height[];
    static int tree;
    static int have=0;
    static boolean thiscan=false;
    static int start=0;
    public static void main(String args[]){
        read();
        Arrays.parallelSort(height);// 정렬해줌
        for(int i= height.length-1;i>=0;i--){ //뒤에서 부터 하니까 큰것 부터임
            if(have==0){ //have는 0이 아닌 수 0이 아닌 수가 0이되면서 시작하면 결과는 YES이고 정지
                thiscan=true;
                break;
            }
            if(!(height[i]==0)){ //이제부터 have는 0이 아니기 때문에 무언가 남아있는 애들이 있음 근데 중간에 빼기가 문제가 생겨서 중간부분에 0이 생기는고 지나가는 부분을 위해 넣음 0이면 그냥 지나감
                if(height[i]>=2){ //0이 아니라는 가정하에 1이면 뒤에도 무조건 전부 1임(작은것 부터 지우고 큰것부터 계산하니까) 그래서 1이면 2를 줄 곳이 없어서 NO임
                    boolean isodd=false;
                    if(!(height[i]%2==0)){
                        isodd=true;
                    }
                    int power=height[i]/2; //일단 2를 준내 해준거임 power은 남은 1
                    height[i]=0;//일단 2만큼 해줬으니까 0해줌
                    have--;
                    if(power==0){
                        break;
                    }
                    for(int j=start;j<i;j++){
                        if(!(height[j]==0)){ //이제는 작은것 부터 해줄 거임 왜냐면 1같은 작은 애들은 무조건 1만 쓸 수 있으니까
                            if(height[j]<power){ //남은게 더 많으면 power에서 빼고 0으로 만들어줌
                                power -=height[j];
                                height[j]=0;
                                have--;
                            }else if(height[j]==power){
                                power=0;
                                start=j+1;
                                have--;
                                break;
                            }
                            else{
                                height[j] -=power; //무조건 작으니까 빼주고 power에 0 넣어줌
                                power=0;
                                start=j;
                                break;
                            }
                        }
                    }
                    if(!(power==0)){
                        if(isodd){
                            power=power*2+1;
                        }else{
                            power=power*2;
                        }
                        if(power%3==0){ //남은게 3의 배수면 3씩 주면 되는거니까 가능
                            thiscan=true;
                            break;
                        }
                        else{
                            break; //모든걸 하고도 안되면 실패지 뭐 기본 실패니까 그냥 둠
                        }
                    }else{
                        if(isodd){
                            boolean isdoing=false;
                            for(int j=start;j<i;j++){
                                if(height[j]>=2){
                                    height[j] -=2;
                                    isdoing=true;
                                    if(height[j]==0){
                                        have--;
                                    }
                                    break;
                                }
                            }
                            if(!isdoing){
                                break;
                            }
                        }
                    }
                }
            }
        }
        if(thiscan){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }


    public static void read(){
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        try {
            tree = Integer.parseInt(br.readLine());
            height = new int[tree];
            StringTokenizer str = new StringTokenizer(br.readLine());
            for(int i=0;i<tree;i++){
                height[i]=Integer.parseInt(str.nextToken());
                if(height[i]>0) have++;
            }
        }catch (Exception e){
            while (true){

            }
        }// 입력 종료
    }
}

