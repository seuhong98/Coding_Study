package Programming_Contest.UCPC2020.G;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


class Node{
    private Stack<Integer> neighbor;
    private int Count_neighbor;
    private int infected_time;
    private int Infected_neighbor;
    private boolean myInfected;
    private int minimum;

    public Node() {
        neighbor=new Stack<Integer>();
        infected_time=-1;
        Infected_neighbor=0;
        myInfected=false;
    }

    public void setoverRead(int Count,int least) {
       Count_neighbor=Count;
       minimum=least;
    }

    public void addNeighbor(int n){
        neighbor.push(n);
    }

    public Stack<Integer> spreadList(){
        return neighbor;
    }

    public int getCount_neighbor() {
        return Count_neighbor;
    }

    public void setMyInfected(){
        infected_time=0;
        myInfected=true;
    }
    public int getInfected_time(){
        return infected_time;
    }

    public boolean isMyInfected() {
        return myInfected;
    }

    public void addInfectedN(){
        Infected_neighbor++;
    }

    public void spreedOver(){
        myInfected=false;
    }
    public boolean isinfected(int time){
        if(!(Count_neighbor==0)){
            if(minimum<=Infected_neighbor){
                myInfected=true;
                infected_time=time;
                return true;
            }
        }
        return false;
    }

}







public class Main {

    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        Node people[] = new Node[N];
        read(br,people);
        infectedSet(br,people);
        findAnswer(people);
        printAnswer(people);
    }

    public static void read(BufferedReader br, Node people[]) throws IOException {
        for(int i=0;i< people.length;i++){
            people[i]=new Node();
        }
        for(int i=0;i< people.length;i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int ner=0;
            while (true){
                int get=Integer.parseInt(str.nextToken());
                if(get==0){
                    break;
                }else{
                    ner++;
                    people[i].addNeighbor(get);
                }
            }
            int temp=ner>>1;
            if(ner%2==0){
                people[i].setoverRead(ner,temp);
            }else{
                people[i].setoverRead(ner,temp+1);
            }
        }
    }
    public static void infectedSet(BufferedReader br, Node people[]) throws IOException {
        int in= Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int i=0;i<in;i++){
            people[Integer.parseInt(str.nextToken())-1].setMyInfected();
        }
    }
    public static void findAnswer(Node people[]){
        Stack<Integer> q = new Stack<Integer>();
        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> getSpread;
        for(int i=0;i< people.length;i++){
            if(people[i].isMyInfected()){
                q.push(i);
            }
        }
        int time=0;
        boolean spread[]= new boolean[people.length];
        while (true){
            time++;
            boolean check=true;
            getSpread = new Stack<Integer>();
            while (!q.isEmpty()){
                check=false;
                int temp=q.pop();
                spread[temp]=true;
                st=people[temp].spreadList();
                while (!st.isEmpty()){
                    int ttemp=st.pop()-1;
                    if(!spread[ttemp]){
                        people[ttemp].addInfectedN();
                        getSpread.push(ttemp);
                    }
                }
            }
            if(check){
                break;
            }
            while (!getSpread.isEmpty()){
                int ttt=getSpread.pop();
                if(!spread[ttt]){
                    if(people[ttt].isinfected(time)){
                        q.push(ttt);
                    }
                }
            }
        }
    }
    public static void printAnswer(Node people[]){
        for(int i=0;i<people.length-1;i++){
            System.out.print(people[i].getInfected_time()+" ");
        }
        System.out.print(people[people.length-1].getInfected_time());
    }
}
