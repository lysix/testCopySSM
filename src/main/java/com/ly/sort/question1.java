package com.ly.sort;

import java.io.InputStream;
import java.util.*;

public class question1 {

    public static void main(String[] args) {

        String  s = "abcdesd";

        byte[] bs = s.getBytes();

        HashSet hashSet = new HashSet(20);
        HashMap<Byte,Integer> num = new HashMap<>(20);
        for (byte b:bs){
            int i = 1;
           boolean flag =  hashSet.add(b);
           if (flag == true){
               num.put(b,i);
           }

           if (flag==false){
               int f = num.get(b);
               f++;
               num.remove(b);
               num.put(b,f);
           }
        }
        Set set = num.keySet();
        ArrayList<Integer> integers = new ArrayList<>(20);
        Iterator iterator = set.iterator();
        Object b;
        int max = 0;

        while((b = iterator.next())!=null){
           int size  =  num.get(b);
           if (size>max){
               max = size;
           }
           if (size==max){

           }
        }


    }
}
