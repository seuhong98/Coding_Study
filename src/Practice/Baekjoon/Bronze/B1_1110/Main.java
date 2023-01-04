package Practice.Baekjoon.Bronze.B1_1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        int answer = Integer.parseInt(input);
        int array[]={0,0};
        int count=0;
        if(input.length() == 1){
            count++;
            array[0] = Integer.parseInt(input);
            array[1] = array[0];
        }else{
            array[0] = input.charAt(0)-48;
            array[1] = input.charAt(1)-48;
        }
        if(array[0]==0){
            System.out.println(1);
        }else {
            do{
                int temp = (array[0]+array[1])%10;
                array[0] = array[1];
                array[1] = temp;
                count++;
            } while (answer != (array[0]*10 + array[1]));
            System.out.println(count);
        }

    }
}
