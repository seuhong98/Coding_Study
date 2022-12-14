package Practice.Baekjoon.Sliver.S4_1059;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[Integer.parseInt(br.readLine())];
        String[] t = br.readLine().split(" ");
        for(int i=0;i<array.length;i++){
            array[i] = Integer.parseInt(t[i]);
        }
        int n = Integer.parseInt(br.readLine());
        Arrays.sort(array);
        br.close();
        boolean check = true;
        for(int i=0;i<array.length;i++){
            if(array[i]==n){
                check = false;
                System.out.println(0);
                break;
            }
        }
        if(check){
            int start =0;
            int end =0;
            int answer = 0;
            for(int i=0;i<array.length;i++){
                try {
                    if(array[i]>n){
                        end = array[i]-1;
                        start=array[i-1]+1;
                        break;
                    }
                }catch (Exception e){
                    start=1;
                    break;
                }
            }
            for(int i=start;i<end;i++){
                for(int j=i+1;j<=end;j++){
                    if(i<=n && j>=n){
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
