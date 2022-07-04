package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        long b = Long.parseLong(br.readLine());
        try{
            long c= Math.multiplyExact(a,b);
        }catch (ArithmeticException e){
            System.out.println("err");
        }

        long c= a*b;
        System.out.println(a*b);
    }


}
