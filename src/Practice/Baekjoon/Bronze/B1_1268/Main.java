package Practice.Baekjoon.Bronze.B1_1268;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int human =  Integer.parseInt(br.readLine());
        int[][] data  =new int[5][human];
        List<Student> answer = new ArrayList<>();
        for(int i =0 ;i<human; i++){
            answer.add(new Student(i));
        }
        for(int i=0;i<human;i++){
            Integer[] read = Arrays.stream(br.readLine().split(" ")).map(s -> Integer.parseInt(s)).toArray(Integer[] :: new);
            for(int j=0;j<5;j++){
                data[j][i] = read[j];
            }
        }
        for(int[] read : data){
            for(int i=1;i<=9;i++){
                List<Integer> save = new ArrayList<>();
                for(int j=0;j<human;j++){
                    if(read[j] == i){
                        save.add(j);
                    }
                }
                for(int me : save){
                    for(int target : save){
                        answer.get(me).friend.add(target);
                    }
                }
            }
        }
        System.out.println(Collections.max(answer).me+1);
    }


    static class Student implements Comparable<Student>{
        int me;
        Set<Integer> friend;

        Student(int i){
            this.me = i;
            friend = new HashSet<>();
            friend.add(me);
        }

        @Override
        public int compareTo(Student o) {
            return  this.friend.size() -  o.friend.size();
        }
    }
}

