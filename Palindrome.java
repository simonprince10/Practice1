package com.company;

public class Palindrome {
    public static void main(String[] args) {
        int num = 3563;
        int rem = 0, reversedNum = 0;
        int temp = num;
        while (num != 0) {
            rem = num % 10;
            reversedNum = reversedNum * 10 + rem;
            num /= 10;
        }
        if (temp == reversedNum) {
            System.out.println(temp + " is Palindrome.");
        } else {
            System.out.println(temp + " is not Palindrome.");
        }
    }
}
