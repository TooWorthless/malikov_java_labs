package com.university.lab4_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(IsPalindrome("WORLD"));
        System.out.println(IsPalindrome("MsG"));
        System.out.println(IsPalindrome("kok"));
        System.out.println(IsPalindrome("k ok"));
    }

    public static boolean IsPalindrome(String str) {
        if(str.isEmpty()) return true;

        int first = 0;
        int last = str.length() - 1;

        while (first <= last)
        {
            char currentFirst = str.charAt(first);
            char currentLast = str.charAt(last);

            if(currentFirst == ' ') {
                first++;
            }
            else if(currentLast == ' ') {
                last--;
            }
            else {
                if(Character.toLowerCase(currentFirst) != Character.toLowerCase(currentLast)) return false;
                first++;
                last--;
            }
        }

        return true;
    }
}