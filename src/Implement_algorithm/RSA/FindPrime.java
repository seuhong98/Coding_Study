package Implement_algorithm.RSA;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FindPrime {
    static String Integer512="26815615859885194199148049996411692254958731641184786755447122887443528060147093953603748596333806855380063716372972101707507765623893139892867298012168192";
    static String Integer520="6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151";

    static BigInteger end = new BigInteger(Integer520);
    static BigInteger start = new BigInteger(Integer512);
    static BigInteger One = new BigInteger("1");

    public static void main(String[] args) {
        int certainty = 15;
        System.out.println("소수일 확률 : "+(1-((Math.pow(0.5,certainty)))));
        try {
            File file = new File("/Users/sinseungho/Desktop/Prime/primeUp512.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            int howmany = 0;
            BigInteger now = start;
            while (howmany<100 && (now.compareTo(end) <1)){
                if(now.isProbablePrime(certainty)){
                    writer.write(now.toString()+"\n");
                    writer.flush();
                    howmany++;
                }
                now = now.add(One);
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static String MakeBitToInteger(int want){
        BigInteger a = new BigInteger("2");
        BigInteger answer = new BigInteger("2");
        for(int i=1;i<=want;i++){
            answer = answer.multiply(a);
        }
        //결과에 -1
        return answer.toString();
    }


}
