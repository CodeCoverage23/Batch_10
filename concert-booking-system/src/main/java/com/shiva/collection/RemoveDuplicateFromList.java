package com.shiva.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {


    public static void main(String[] args) {
        List<String> tempList =new ArrayList<>();
        List<String> list =new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        System.out.println(list);

        Set<String> set=new HashSet<>(list);
        System.out.println("set "+set);

        for (String element:list){
            if(!tempList.contains(element)){
                tempList.add(element);
            }
        }

        System.out.println("list iterater "+tempList);

        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println("java 8 "+collect);
    }
}
