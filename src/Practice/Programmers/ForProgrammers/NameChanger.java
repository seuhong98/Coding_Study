package Practice.Programmers.ForProgrammers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NameChanger {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Url -> name : 1 name -> Url : 2");
            if(br.readLine().equals("1")){
                System.out.print("Url : ");
                System.out.println(br.readLine().replace("/","_"));
            }else{
                System.out.print("name : ");
                System.out.println(br.readLine().replace("_","/"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
