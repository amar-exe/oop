package com.company;
import java.lang.reflect.Array;
import java.util.*;


public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();

        list1.add(5);
        list1.add(6);

        list2.add(1);
        list2.add(2);
        list2.add(3);

        combine(list1,list2);

        System.out.println(list1);
        System.out.println(list2);
    }

    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second){
            first.addAll(second);
    }

}
