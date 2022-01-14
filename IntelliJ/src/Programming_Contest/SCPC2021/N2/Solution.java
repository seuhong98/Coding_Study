package Programming_Contest.SCPC2021.N2;




import java.util.Scanner;

public class Solution {
    static boolean use[];
    static boolean a[];
    static boolean com=false;
    static boolean b[];
    static int step;
    static int Answer;
    //기초 전역 변수들

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int test_case = 0; test_case < T; test_case++) {
            String len[] = sc.nextLine().split(" ");
            b = new boolean[Integer.parseInt(len[0])];
            step = Integer.parseInt(len[1]);
            char bb[] = sc.nextLine().toCharArray();
            for (int i = 0; i < bb.length; i++) {
                if (bb[i] == '1') {
                    b[i] = true;
                }
            }
            a = new boolean[b.length];
            use=new boolean[b.length];
            //정리 끝

            setFirst();

            repeat(step);
            System.out.println("Case #" + (test_case + 1));
            String len1="%"+b.length+"s";
            System.out.println(String.format(len1, Integer.toBinaryString(Answer)).replaceAll(" ", "0"));
            com=false;
        }
    }

    private static void repeat(int where){
        boolean not=true;
        if(!com){
            for(int i=where;i<b.length-step;i++){
                if(b[i]){
                    not=false;
                    if((!use[i-step])&&(!use[i+step])){
                        use[i+step]=true;
                        use[i-step]=true;

                        a[i+step]=true;
                        a[i-step]=false;
                        repeat(i+1);
                        if(com){break;}


                        a[i+step]=false;
                        a[i-step]=true;
                        repeat(i+1);
                        if(com){break;}


                        a[i+step]=true;
                        a[i-step]=true;
                        repeat(i+1);
                        if(com){break;}

                        use[i+step]=false;
                        use[i-step]=false;
                    }
                    else if((!use[i-step])&&(use[i+step])){
                        use[i-step]=true;
                        if(a[i+step]){
                            a[i-step]=false;
                            repeat(i+1);
                            if(com){break;}
                            a[i-step]=true;
                            repeat(i+1);
                            if(com){break;}
                        }else{
                            a[i-step]=true;
                            repeat(i+1);
                            if(com){break;}
                        }
                        use[i-step]=false;
                    }else if((use[i-step])&&(!use[i+step])){
                        use[i+step]=true;
                        if(a[i-step]){
                            a[i+step]=false;
                            repeat(i+1);
                            if(com){break;}

                            a[i+step]=true;
                            repeat(i+1);
                            if(com){break;}
                        }else{
                            a[i+step]=true;
                            repeat(i+1);
                            if(com){break;}
                        }
                        use[i+step]=false;
                    }else if((use[i-step])&&(use[i+step])){
                        if((!a[i-step])&&(!a[i+step])){ }
                        else {
                            repeat(i+1);
                            if(com){break;}
                        }
                    }
                }
            }
            if(not){ //더이상 진행이 안될경우
                com=true;
                Answer=makeInteger();
            }
        }
    }

    private static void setFirst(){
        for(int i=0;i<step;i++){
            if((i+step)<a.length){
                use[i+step]=true;
                if(b[i]){
                    a[i+step]=true;
                }else{
                    a[i+step]=false;
                }
            }
        }
        for(int i=a.length-1;i>a.length-1-step;i--){
            if((i-step)>0){
                use[i-step]=true;
                if(b[i]){
                    a[i-step]=true;
                }else{
                    a[i-step]=false;
                }
            }
        }
        for(int i=step;i<a.length-step;i++){
            if(!b[i]){
                use[i+step]=true;
                use[i-step]=true;
                a[i-step]=false;
                a[i+step]=false;
            }
        }
    }
    private static int makeInteger(){
        int n = 0, l = a.length;
        for (int i = 0; i < l; ++i) {
            n = (n << 1) + (a[i] ? 1 : 0);
        }
        return n;
    }
}