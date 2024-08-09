package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        convertDecimalToBinary(13);
    }

    public static boolean checkForPalindrome(String word) {
        word = word.replaceAll("[^a-zA-Z]", "").toLowerCase(Locale.ENGLISH);
        System.out.println(word);

        String[] letters = word.split("");

        for(int i = 0; i < letters.length / 2; i++) {
            if(!letters[i].equals(letters[letters.length-i-1])) {
                return false;
            }
        }
        return true;
    }

    public static String convertDecimalToBinary(int num) {
        List<Integer> digits = new LinkedList<>();

        while(num > 0) {
            digits.add(num%2);
            num /= 2;
        }

        Collections.reverse(digits);

        System.out.println(digits);

        String binary = "";

        for(int digit : digits) {
            binary += String.valueOf(digit);
        }

        System.out.println(binary);
        return binary;
    }


}