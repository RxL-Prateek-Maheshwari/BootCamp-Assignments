// package com.company;

import java.util.ArrayList;
import java.util.List;

public class arraylist_common_elements  {
    public static void main(String[] args){
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(2);l1.add(4);l1.add(1);l1.add(56);l1.add(3);
        l2.add(56);l2.add(8);l2.add(2);l2.add(4);l2.add(3);
        l1.retainAll(l2);
        System.out.println(l1);
    }
}
