package Practice.Baekjoon.Bronze.B2_19532;


import java.util.Scanner;

public class Main {
    static int A[]=new int[3];
    static int B[]=new int[3];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Answer [] =new int[2];
        for(int i=0;i<3;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            B[i]=sc.nextInt();
        }
        check();
    }
    public static void check(){
        for(int i=-999;i<1000;i++){
            for(int j=-999;j<1000;j++){
                if(A[0]*i+A[1]*j==A[2]){
                    if(B[0]*i+B[1]*j==B[2]){
                        System.out.println(i+" "+j);
                        return;
                    }
                }
            }
        }
    }
}

