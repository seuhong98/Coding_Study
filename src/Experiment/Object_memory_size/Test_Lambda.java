package Experiment.Object_memory_size;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test_Lambda {
    public static void main(String[] args) {
        int kb = 1024;
        Runtime runtime = Runtime.getRuntime();
        int age = 25;
        String name = "name";
        double height = 178.0;
        List<Person1> list = new ArrayList<>(50000000);

        for(int i =0;i<50000000;i++){
            list.add(new Person1(age,name,height));
        }
        Collections.sort(list, new Comparator<Person1>() {
            @Override
            public int compare(Person1 o1, Person1 o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println("##### 사용한 메모리 확인 [KB] #####");
        System.out.println("사용한 메모리 :"
                + (runtime.totalMemory() - runtime.freeMemory()) / kb);

        /**
         * ##### 사용한 메모리 확인 [KB] #####
         * 사용한 메모리 :1797040
         */
    }
}
class Person1{
    int age;
    String name;
    double height;
    Person1(int age, String name, double height){
        this.age = age;
        this.name = name;
        this.height = height;
    }
}
