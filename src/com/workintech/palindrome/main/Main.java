package com.workintech.palindrome.main;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindromeFIFO("abccba"));
        System.out.println(checkForPalindromeFIFO("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindromeFIFO("I did, did I?"));
        System.out.println(checkForPalindromeFIFO("hello"));
        System.out.println(checkForPalindromeFIFO("Don't node"));
        System.out.println(convertDecimalToBinary(13));
    }

//    public static boolean checkForPalindrome(String text) {
//        LinkedList<Character> stack = new LinkedList<>();
//        StringBuilder noPunctionString = new StringBuilder();
//        String lowerCase = text.toLowerCase();
//
//        for (int i = 0; i < lowerCase.length(); i++) {
//            char c = lowerCase.charAt(i);
//            if (c >= 'a' && c <= 'z') {
//                noPunctionString.append(c);
//                stack.push(c);
//            }
//        }
//
//        StringBuilder reversed = new StringBuilder();
//        while (stack.isEmpty()) {
//            reversed.append(stack.pop());
//        }
//
//        return noPunctionString.toString().equals(reversed.toString());
//    }

    public static boolean checkForPalindromeFIFO(String text) {
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        String lowerCase = text.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.addFirst(c);//ya da push
            }
        }
        return stack.toString().equals(queue.toString());
    }

    public static String convertDecimalToBinary(int num){

        final int base = 2;
        Stack digits = new Stack();

        while(num>0){
            digits.push(num%base);
            num = num/base;
        }
//        return digits.toString();
       String bits = "";
      while(!digits.isEmpty()){
            bits += digits.pop();
       }
       return bits;
    }
}