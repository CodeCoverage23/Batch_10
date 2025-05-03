package com.shiva.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FinalListExample {

    public static void main(String[] args) {

    	final int a=1;
    	//a=2;
       final List<String> list=new ArrayList<>();

        list.add("abc");
        list.add("def");
       // list = null;
        System.out.println(list);
        
       // list = new LinkedList<String>();

    }
}
