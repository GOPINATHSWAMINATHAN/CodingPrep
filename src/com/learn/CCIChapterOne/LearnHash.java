package com.learn.CCIChapterOne;

import java.util.*;

public class LearnHash {


    public static void main(String[] args) {
        Hashtable balance = new Hashtable();
        Enumeration names;
        int str;
        double bal;

        balance.put(1, 1.0);
        balance.put(2, 2.0);
        balance.put(3, 3.0);
        balance.put(4, 4.0);
        balance.put(5, 5.0);
        balance.put(6, 6.0);

        names = balance.keys();

        while (names.hasMoreElements()) {
            str = (Integer) names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }

//        balance.put("five",0.50);
//        System.out.println(balance.get("five"));


    }
}
