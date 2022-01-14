package Practice.Baekjoon.Gold.G4_1034;


//포기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(readArr(br),readK(br));
    }

    /**
     * 입력을 읽어오기
     * @return 읽어온 배열
     * @throws IOException
     */
    public static boolean[][] readArr(BufferedReader br) throws IOException {
        StringTokenizer str = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(str.nextToken());
        int col = Integer.parseInt(str.nextToken());
        boolean arr[][] =new boolean[row][col];
        for(int i=0;i<row;i++){
            char temp[]=br.readLine().toCharArray();
            for(int j=0;j<col;j++){
                if(temp[j]=='1'){
                    arr[i][j]=true;
                }
            }
        }
        return arr;
    }

    /**
     * K읽어오기
     * @param br 버퍼 넘겨주기
     * @return K
     * @throws IOException
     */
    public static int readK(BufferedReader br)throws IOException{
        return Integer.parseInt(br.readLine());
    }

    public static void solution(boolean [][]arr , int K){
        boolean check[]= new boolean[arr[0].length];
        int Neven = checkHowMany(arr);
        int Nodd;
        int numberofZero[] = new int[arr[0].length];
        for(int i=0;i<arr[0].length;i++){
            for(int k=0;k<arr.length;k++){
                if(!arr[k][i]){
                    numberofZero[i]++;
                }
            }
        }
        for(int hhh=0;hhh<arr.length;hhh++){
            System.out.println(Arrays.toString(arr[hhh]));
        }
        System.out.println(Arrays.toString(numberofZero));
        System.out.println();
        if(K>arr[0].length){
            K=arr[0].length;
        }
        int bigWhere[]=new int[2];
        findbig(numberofZero,bigWhere);
        numberofZero[bigWhere[1]]=Math.abs(bigWhere[0]-arr[0].length);
        System.out.println(bigWhere[1]+"을 바꿈");
        System.out.println(Arrays.toString(numberofZero));
        convert(arr,bigWhere[1]);
        Nodd=checkHowMany(arr);
        //check[bigWhere[1]]=true;
        for(int hhh=0;hhh<arr.length;hhh++){
            System.out.println(Arrays.toString(arr[hhh]));
        }
        System.out.println();
        boolean even=false;
        for (int i=2;i<=K;i++){
            findbig(numberofZero,bigWhere);
            if(!(bigWhere[0]>=(arr[0].length>>1))) {
                break;
            }
            numberofZero[bigWhere[1]]=Math.abs(bigWhere[0]-arr[0].length);
            System.out.println(bigWhere[1]+"번째 바꿈");
            convert(arr,bigWhere[1]);
            for(int hhh=0;hhh<arr.length;hhh++){
                System.out.println(Arrays.toString(arr[hhh]));
            }
            System.out.println(Arrays.toString(numberofZero));
            System.out.println();
            even= !even;
            int tttttt=checkHowMany(arr);
            System.out.println(tttttt);
            if(even){
                if(tttttt>Neven){
                    Neven=tttttt;
                }
            }else{
                Nodd=tttttt;
            }
        }
        if(K%2==0){
            System.out.println(Neven);
        }else {
            System.out.println(Nodd);
        }
    }


    public static int changeInt(boolean use[]){
        int n = 0, l = use.length;
        for (int i = 0; i < l; ++i) {
            n = (n << 1) + (use[i] ? 1 : 0);
        }
        return n;
    }

    public static void findbig(int numberofZero[],int temp[]){
        for(int i=0;i< numberofZero.length;i++){
            if(numberofZero[i]>temp[0]){
                temp[0]=numberofZero[i];
                temp[1]=i;
            }
        }
    }

    public static int checkHowMany(boolean arr[][]){
        int howmany=0;
        for(int i=0;i<arr.length;i++){
            boolean temp=true;
            for(int k=0;k<arr[0].length;k++){
                if(!arr[i][k]){
                    temp=false;
                    break;
                }
            }
            if(temp){
                howmany++;
            }
        }
        return howmany;
    }
    public static void convert(boolean arr[][],int where){
        for(int j=0;j<arr.length;j++){
            arr[j][where]=!(arr[j][where]);
        }
    }

}
