package Practice.Baekjoon.Bronze.B1_1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //알파벳 개수
        int arr[] = new int[26];
        Scanner input = new Scanner(System.in);
        //읽어오기
        char[] read = input.nextLine().toCharArray();
        //아스키코드 기준으로 소문자면 대문자로 변경해주고 카운트
        for(int i : read){
            if(i>=97 && i<= 122){
                i -= 32;
            }
            arr[i-65] += 1;
        }
        //같은게 있으면 최대값이 여러개이상이라는 뜻 따라서 is_same이 true되면 break
        boolean is_same = false;
        //가장 큰 값 찾기
        int top =-1;
        int where = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                if(top == arr[i]){
                    is_same = true;
                }else if(top<arr[i]){
                    top = arr[i];
                    where = i+65;
                    is_same = false;
                }
            }
        }
        //같은것이 2개이상이면 break
        if(is_same){
            System.out.println("?");
        }else{
            //케릭터 값으로 출력
            System.out.println((char)where );
        }
    }
}
