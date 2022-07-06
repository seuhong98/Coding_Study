package Practice.Baekjoon.Bronze.B2_2798;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int len;
    static int max;
    static int[] arr;
    static int mymax=0;
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input(br);
            br.close();
        }catch (Exception e){}
        find(0,new boolean[len],0);
        System.out.println(mymax);
    }

    public static void find(int deep, boolean use[],int now){
        if(deep<3){
            for(int i=len-1;i>=0;i--){
                if(!use[i]){
                    use[i] = true;
                    int temp = now+arr[i];
                    if(temp<=max){
                        find((deep+1),use,temp);
                    }
                    use[i] = false;
                }
            }
        }else{
            if(now>mymax){
                mymax=now;
            }
        }
    }




    public static void input(BufferedReader br){
        try{
            StringTokenizer str = new StringTokenizer(br.readLine());
            len = Integer.parseInt(str.nextToken());
            max = Integer.parseInt(str.nextToken());
            str = new StringTokenizer(br.readLine());
            arr = new int[len];
            for(int i=0;i<len;i++){
                arr[i]=Integer.parseInt(str.nextToken());
            }
        }catch (Exception e){}
    }
}
