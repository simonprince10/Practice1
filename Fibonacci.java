package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        int num=10;
        int n1=0,n2=1;
        for(int i=1;i<num;i++){
           int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println(n1);
    }
}
