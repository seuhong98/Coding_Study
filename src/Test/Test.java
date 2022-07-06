package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Stack<Integer> save = new Stack<>();
        save.push(1);
        save.pop();
        System.out.println(save.empty());
    }


}
