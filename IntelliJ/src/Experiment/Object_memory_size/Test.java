package Experiment.Object_memory_size;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int kb = 1024;
        Runtime runtime = Runtime.getRuntime();
        int age = 25;
        String name = "name";
        double height = 178.0;
        List<Person2> list = new ArrayList<>(50000000);

        for(int i =0;i<50000000;i++){
            list.add(new Person2(age,name,height));
        }
        Collections.sort(list);
        System.out.println("##### 사용한 메모리 확인 [KB] #####");
        System.out.println("사용한 메모리 :"
                + (runtime.totalMemory() - runtime.freeMemory()) / kb);
        /**
         * ##### 사용한 메모리 확인 [KB] #####
         * 사용한 메모리 :1793968
         */
    }
}
class Person2 implements Comparable<Person2>{
    int age;
    String name;
    double height;

    @Override
    public int compareTo(Person2 o) {
        return this.age - o.age;
    }

    Person2(int age, String name, double height){
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double temp(){
        return this.height*this.height*this.height*this.height*this.height*this.height*this.height*this.height*this.height*this.height*this.height*this.height*this.height*this.height*this.height*this.height*this.height*this.height;
    }
    public int temp2(){
        return this.age*this.age*this.age*this.age*this.age*this.age*this.age*this.age*this.age*this.age*this.age*this.age*this.age*this.age*this.age*this.age*this.age*this.age;
    }

    public String temp3(){
        return this.name+this.name+this.name+this.name+this.name+this.name+this.name+this.name+this.name+this.name+this.name+this.name+this.name+this.name+this.name+this.name+this.name+this.name+this.name+this.name+this.name;
    }

    public String temp4(){
        return this.name+this.height+this.age+this.name+this.height+this.age+this.name+this.height+this.age+this.name+this.height+this.age+this.name+this.height+this.age+this.name+this.height+this.age+this.name+this.height+this.age+this.name+this.height+this.age+this.name+this.height+this.age+this.name+this.height+this.age+this.name+this.height+this.age+this.name+this.height+this.age+this.name+this.height+this.age+this.name+this.height+this.age;
    }
}