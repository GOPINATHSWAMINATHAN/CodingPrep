package com.learn.CCIChapterOne;


//1.2 Check Permutation - Given two strings, write a method to decide if one is permutation of the other.
//Page 90
public class Two {

    static String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    static boolean checkPermutation(String one, String two) {
        return sort(one).equals(sort(two));
    }

    public static void main(String[] args) {
        System.out.println(checkPermutation("gopi", "piog"));


    }


}
