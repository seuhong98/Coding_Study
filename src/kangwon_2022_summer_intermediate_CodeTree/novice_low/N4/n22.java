package kangwon_2022_summer_intermediate_CodeTree.novice_low.N4;

import java.util.Scanner;

public class n22 {
    public static void main(String[] args) {
        int read = new Scanner(System.in).nextInt();
        if(read%2 !=0){
            read +=3;
        }
        System.out.print(read%3== 0 ? read/3 : read);
    }
}
