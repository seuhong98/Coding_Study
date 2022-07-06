package Practice.Baekjoon.Gold.G3_1005;
import java.io.*;
import java.util.Arrays;
public class Main {
    static int how[][];
    static int time[];
    static int book[];
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer[]=new int[Integer.parseInt(input)];
        for(int doing=0;doing<answer.length;doing++) {
            input = br.readLine();
            String ttt[]=input.split(" ");
            int building=Integer.parseInt(ttt[0]);
            book=new int[building];
            for(int i=0;i<book.length;i++) {
                book[i]=-1;
            }
            int order=Integer.parseInt(ttt[1]);
            input = br.readLine();
            String tttt[]=input.split(" ");
            time=new int[tttt.length];
            for(int i=0;i<time.length;i++) {
                time[i]=Integer.parseInt(tttt[i]);
            }
            how=new int[order][2];
            for(int i=0;i<order;i++) {
                input = br.readLine();
                String ttttt[]=input.split(" ");
                how[i][0]=Integer.parseInt(ttttt[0]);
                how[i][1]=Integer.parseInt(ttttt[1]);
            } //여기까지가 입력
            input = br.readLine();
            answer[doing]=how(Integer.parseInt(input));
            //System.out.println(Arrays.toString(book));
        }

        for(int i=0;i<answer.length;i++) {
            System.out.println(answer[i]);
        }
    }
    public static int how(int what) {
        int my=time[what-1];
        int much=0;
        for(int i=0;i<how.length;i++) {
            if(what==how[i][1]){
                int howw;
                int h=book[how[i][0]-1];
                if(h !=-1) {
                    howw=h;
                }else {
                    howw=how(how[i][0]);
                    book[how[i][0]-1]=howw;
                }
                if(much<howw) {
                    much=howw;
                }
            }
        }
        return much+my;
    }

}