package com.company;
import java.util.*;


public class Main {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() ==0;
        }

        // add
        public static void add(int data){
            list.add(data);
        }

        // remove
        public static int delete(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // get
        public static int get(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(2);
        s.add(4);
        s.add(6);
        s.add(8);
        while(!s.isEmpty()){
            System.out.println(s.get());
            s.delete();
        }
    }
}

