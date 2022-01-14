package Programming_Contest.SCPC2021.N1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 시간초과 해결 방법을 찾아야함
 */
class Solution {
    static int Answer;
    static int group[];
    public static void main(String args[]) throws Exception	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case = 0; test_case < T; test_case++) {
            Answer=0;
            //입력
            int arr[]=new int[sc.nextInt()];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            //입력 완료
            //그룹 초기화
            group = new int[arr.length];
            for(int i=0;i<group.length;i++){
                group[i]=-1;
            }
            //그룹핑
            for(int i=0;i<arr.length;i++){
                if((i+arr[i])<arr.length){
                    if((group[i]==-1)&&(group[i+arr[i]]==-1)){
                        group[i]=i;
                        group[i+arr[i]]=i;
                    }else if((group[i]==-1)&&(!(group[i+arr[i]]==-1))){
                        group[i]=i+arr[i];
                    }else if((!(group[i]==-1))&&(group[i+arr[i]]==-1)){
                        group[i+arr[i]]=i;
                    }else{
                        group[findTop(i+arr[i])]=findTop(i);
                    }
                }
            }
            LinkedList<Integer> have = new LinkedList<Integer>();
            for(int i=0;i<group.length;i++){
                if(group[i]==-1){
                    Answer++;
                }else{
                    int temp=findTop(i);
                    if(!have.contains(temp)){
                        have.add(temp);
                        Answer++;
                    }
                }
            }
            System.out.println("Case #"+(test_case+1));
            System.out.println(Answer);
        }
    }
    private static int findTop(int i){
        if(group[i] == i)
            return i;
        else
            return group[i] = findTop(group[i]);
    }
}