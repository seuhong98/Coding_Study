package Practice.Baekjoon.Gold.G1_1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_NO_HINT {
    static long  min = 0;
    static long start = 0;
    static long max = 0;
    static HashSet<Long> dic;
    static List<Long> prime;

    public static void main(String[] args){
        ReadInput();
        setDic();
        MakeAnswer();
        System.out.println(max-min+1-dic.size());
    }


    /**
     * 입력값 받아오기
     */
    public static void ReadInput(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String read = br.readLine();
            String[] read2 = read.split(" ");
            min = Long.parseLong(read2[0]);
            max = Long.parseLong(read2[1]);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void setDic(){
        prime = new ArrayList<>();
        dic = new HashSet<>();

        prime.add(((long)2));
        double temp = (double)(min/4.0);
        for(long i = ((long) Math.ceil(temp) *4); i<=(max); i+=4){
            dic.add(i);
        }

        prime.add(((long)3));
        temp = (double)(min/9.0);
        for(long i = ((long) Math.ceil(temp) *9); i<=(max); i+=9){
            dic.add(i);
        }
    }

    /**
     * 답 가져오기
     */
    public static void MakeAnswer(){
        for(long i = 5;i<=((long)Math.pow(max,0.5)+1);i++){
            boolean is_prime=true;
            for(long j : prime){
                if(i%j==0){
                    is_prime=false;
                    break;
                }
            }
            if(is_prime){
                for(long j =prime.get(prime.size()-1);j<=((long)Math.pow(i,0.5)+1);j+=2){
                    if(i%j==0){
                        is_prime=false;
                        break;
                    }
                }
            }
            if(is_prime){
                prime.add(i);
                long step = i*i;
                for(long g = (long) (((long) Math.ceil((double)(min/(double)step))) * step); g<=(max); g+=step){
                    dic.add(g);
                }
            }
        }
    }

}


