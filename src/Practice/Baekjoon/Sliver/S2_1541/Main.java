package Practice.Baekjoon.Sliver.S2_1541;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String read = sr.nextLine();
        Integer[] input = Arrays.stream(read.split("\\+|-")).map(s->Integer.parseInt(s)).toArray(Integer[]::new);
        Stream<String> operator_stream = Arrays.stream(read.split("0|1|2|3|4|5|6|7|8|9")).filter(t->t.length()>0);
        String[] operator = operator_stream.toArray(String[]::new);

        int answer = input[0];
        int temp = 0;
        boolean toggle = false; // 이전에 만난 -가 있었는지(temp에 더하고 있었는지)
        for(int i=0;i<operator.length;i++){
            if(operator[i].equals("-")){
                if(toggle){
                    answer -= temp;
                    temp = 0;
                }else {
                    toggle = true;
                }
            }
            if(toggle){
                temp += input[i+1];
            }else{
                answer += input[i+1];
            }
        }
        answer -= temp;
        System.out.println(answer);
    }
}
