package com.company;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharacters {
    public static void main(String[] args) {
        String s="aabc";
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c:s.toCharArray()) {
            if(!map.containsKey(c)){
             map.put(c,1);
            }
            else{
                int freq=map.get(c);
                map.put(c,freq+1);
            }
        }
        for (Map.Entry<Character,Integer> e:map.entrySet()) {
            System.out.println(e.getKey()+" -> " + e.getValue());
        }}}



