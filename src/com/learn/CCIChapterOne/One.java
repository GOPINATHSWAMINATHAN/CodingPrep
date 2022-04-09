package com.learn.CCIChapterOne;

//Problem 1.1 - Page 90

//Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures?

public class One {

    static boolean checkUnique(String input) {
        if (input.length() > 128) return false;
        boolean char_set[] = new boolean[128];
        for (int i = 0; i < input.length(); i++) {
            int val = input.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }

        return true;
    }


    public static void main(String[] args) {
        String[] words = {"bcdwe", "hello", "apple", "kite"};
        for (String word : words)
            System.out.println(word + ": " + checkUnique(word));

    }
}
