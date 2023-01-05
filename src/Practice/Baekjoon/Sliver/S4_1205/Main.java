package Practice.Baekjoon.Sliver.S4_1205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Data data = new Data(); // 값 읽어오기 & 정렬
        if(read(data, br)){
            int count = 0; //등수-> 같은 값에 사용
            int pre = -1; //이전 값
            int answer = -1;
            boolean find = false; //값은 같았으나 범위 밖일 수도 있으므로 일단 지정
            for(int i=0;i<data.getLast();i++){
                try {
                    if(pre != data.getScore()[i]){
                        if(find){
                            answer = count; //같은 값이기 때문에 같은 등수
                            break;
                        }
                        pre = data.getScore()[i]; //이전 값 넣기
                        count = i+1; //등수 넣기
                    }
                    if(!find){
                        if(data.isBig(i)){
                            answer = i+1; //정답에 등수 넣기(이전값과 다르므로 i+1값 넣어줌)
                            break;
                        }else if(data.isSame(i)){
                            find = true; //범위 안에 들었는지 확인하기 위해 일단 true
                        }
                    }
                }catch (Exception e){ //범위는 넉넉한데 맨 뒤에 있을 때
                    if(find){
                        answer = count; //범위 안에 있으므로 count 넣어줌
                    }else{
                        answer = i+1; //가장 마지막 등수 넣어주기
                    }
                    break;
                }
            }
            System.out.println(answer);
        }else{
            System.out.println(1);
        }


    }


    //값 받아오기
    public static boolean read(Data data, BufferedReader br) throws IOException{
        String[] temp = br.readLine().split(" ");
        data.setLen(Integer.parseInt(temp[0]));
        data.setGoal(Integer.parseInt(temp[1]));
        data.setLast(Integer.parseInt(temp[2]));
        if(data.getLen() ==0){
            return false;
        }else {
            data.setScore(Arrays.stream(br.readLine().split(" ")).map(s -> Integer.parseInt(s)).toArray(Integer[] :: new));
            data.sort();
            return true;
        }

    }

    //깨끗하게 정리
    static class Data{
        private Integer[] score;
        private Integer last;
        private Integer len;

        private Integer goal;

        public Integer getGoal() {
            return goal;
        }

        public void setGoal(Integer goal) {
            this.goal = goal;
        }

        public Integer[] getScore() {
            return score;
        }

        public void setScore(Integer[] score) {
            this.score = score;
        }

        public Integer getLast() {
            return last;
        }

        public void setLast(Integer last) {
            this.last = last;
        }

        public Integer getLen() {
            return len;
        }

        public void setLen(Integer len) {
            this.len = len;
        }

        public void sort(){
            Arrays.sort(score, Collections.reverseOrder());
        }

        public Boolean isBig(int i){
            return score[i]<goal;
        }

        public Boolean isSame(int i){
            return score[i]==goal;
        }
    }
}
