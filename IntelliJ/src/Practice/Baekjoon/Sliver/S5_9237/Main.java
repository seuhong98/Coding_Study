package Practice.Baekjoon.Sliver.S5_9237;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int arr[];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        arr = new int[repeat];
        for(int i =0 ;i<repeat; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.parallelSort(arr);
        for(int i=0;i< arr.length;i++){
            arr[i] -= i;
        }
        System.out.println(max()+1+ arr.length);
    }

    private static int max(){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max< arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
