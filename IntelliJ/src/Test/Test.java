package Test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String temp  = "apple@@banana@@jafasdf";
        String[] ttt = temp.split("@@");
        System.out.println(Arrays.toString(ttt));
    }


}
