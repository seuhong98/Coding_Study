package Programming_Contest.UCPC2022.D;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loop = Integer.parseInt(br.readLine());
        List<List<Long>> express = new ArrayList<>();

        boolean is_zz = false;
        for(int keep=0;keep<loop;keep++){
            String read[] = br.readLine().split(" ");
            if(read.length == 3){
                if((read[1].equals("0") && read[2].equals("0")) || is_zz){
                    is_zz = true;
                }else{
                    List<Long> temp = new ArrayList<>(2);
                    temp.add(Long.parseLong(read[1]));
                    temp.add(Long.parseLong(read[2]));
                    express.add(temp);
                }
            }else{
                if(is_zz){
                    bw.write("0"+"\n");
                }else{
                    long my = Long.parseLong(read[1]);
                    boolean setting = true;
                    boolean check =true;
                    for(List<Long> ttt : express){
                        if(ttt.get(0) == 0 || my ==0){
                            if((ttt.get(1)<0)){
                                setting = !setting;
                            }
                        }else if(ttt.get(1) == 0){
                            if(((ttt.get(0)>0) ^ (my>0))){
                                setting = !setting;
                            }
                        }
                        else{
                            if(  (!((ttt.get(0)>0) ^ (my>0)))  && (ttt.get(1)>0)   ){
                            }else if(  ((ttt.get(0)>0) ^ (my>0)) && (ttt.get(1)<0)  ){
                                setting = !setting;
                            }else{

                                //계산해야하는 단계 - + 경우 + - 경우임
                                //양수
                                if((!((ttt.get(0)>0) ^ (my>0)))){
                                    try{
                                        long ans =Math.multiplyExact(ttt.get(0),my);
                                        if(ans < (-1*ttt.get(1))){
                                            setting =!setting;
                                        }else if(ans == (ttt.get(1)*-1)){
                                            bw.write("0"+"\n");
                                            check = false;
                                            break ;
                                        }
                                    }catch (Exception e){
                                    }
                                }else{
                                    try{
                                        long ans =(Math.multiplyExact(ttt.get(0),my)*-1);
                                        if(ans < (ttt.get(1))){
                                        }else if(ans == ttt.get(1)){
                                            bw.write("0"+"\n");
                                            check = false;
                                            break ;
                                        }else{
                                            setting =!setting;
                                        }
                                    }catch (Exception e){
                                        setting =!setting;
                                    }
                                }
                            }
                        }
                    }
                    if(check){
                        if(setting){
                            bw.write("+"+"\n");
                        }else{
                            bw.write("-"+"\n");
                        }
                    }
                }

            }
        }
        bw.close();

    }
}
