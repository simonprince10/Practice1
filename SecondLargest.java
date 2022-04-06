package com.company;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>highest){
                secondHighest=highest;
                highest=arr[i];}
            else  if(arr[i]>secondHighest && arr[i]!=highest){
                secondHighest=arr[i];
            }
        }
        System.out.println(secondHighest);
    }}
