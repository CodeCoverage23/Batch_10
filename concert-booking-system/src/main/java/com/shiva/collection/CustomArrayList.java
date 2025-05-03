package com.shiva.collection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CustomArrayList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if(this.contains(o)){
            return true;
        }else{
            return super.add(o);
        }
    }
    public static void main(String[] args) {

        CustomArrayList list1=new CustomArrayList();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(2);

        System.out.println(list1);
        Set set1=new HashSet<>();
        set1.add(1);
        set1.add(1);
        set1.add(1);
        set1.add(2);
        System.out.println(set1);
        
        Set<Student> set=new HashSet<>();
        Student s1=new Student(101,"shiva");
        Student s2=new Student(101,"shiva");
        Student s3=new Student(105,"shankar");
        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);
    }
}
