package Practice.Baekjoon.Sliver.S2_11060;

import java.util.Scanner;

public class Main {
    private static int arr[];
    private static int dp[];
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        arr=new int[sc.nextInt()];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        dp=new int[arr.length];
        for(int i=1;i<=arr[0];i++){
            dp[i] +=1;
        }
        for(int i=1;i<arr.length;i++){
            if(!(dp[i]==0)){
                int temp = dp[i]+1;
                try{
                    for(int k=i+1;k<=arr[i]+i;k++){
                        if(temp<dp[k]||dp[k]==0){
                            dp[k]=temp;
                        }
                    }
                }catch (Exception e){ }
            }
        }
        if(dp.length==1){
            System.out.println(0);
        }
        else if(dp[dp.length-1]==0){
            System.out.println(-1);
        }else{
            System.out.println(dp[dp.length-1]);
        }

    }
}
