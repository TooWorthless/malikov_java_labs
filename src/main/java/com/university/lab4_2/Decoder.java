package com.university.lab4_2;

public class Decoder {
    public static String decodeVowels(String input) {
        StringBuilder decoded = new StringBuilder();
        for (char c : input.toCharArray()) {
            switch (c) {
                case '1':
                    decoded.append('a');
                    break;
                case '2':
                    decoded.append('e');
                    break;
                case '3':
                    decoded.append('i');
                    break;
                case '4':
                    decoded.append('o');
                    break;
                case '5':
                    decoded.append('u');
                    break;
                default:
                    decoded.append(c);
            }
        }
        return decoded.toString();
    }

    public static String encodeVowels(String input) {
        StringBuilder decoded = new StringBuilder();
        for (char c : input.toCharArray()) {
            switch (c) {
                case 'a':
                    decoded.append('1');
                    break;
                case 'e':
                    decoded.append('2');
                    break;
                case 'i':
                    decoded.append('3');
                    break;
                case 'o':
                    decoded.append('4');
                    break;
                case 'u':
                    decoded.append('5');
                    break;
                default:
                    decoded.append(c);
            }
        }
        return decoded.toString();
    }

    public static String encodeConsonants(String input) {
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            char nextConsonant = getNext(c);
            decoded.append(nextConsonant);
        }
        return decoded.toString();
    }

    public static String decodeConsonants(String input) {
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            char nextConsonant = getPrevious(c);
            decoded.append(nextConsonant);
        }
        return decoded.toString();
    }

    // A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
    // private static boolean isConsonant(char c) {
    //     return "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(c) != -1;
    // }

    private static char getNext(char c) {
        String consonants = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index = consonants.indexOf(c);
        if (index != -1 && index < consonants.length() - 1) {
            return consonants.charAt(index + 1);
        }
        return c;
    }
    private static char getPrevious(char c) {
        String consonants = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index = consonants.indexOf(c);
        if (index != 0 && index <= consonants.length()) {
            return consonants.charAt(index - 1);
        }
        return c;
    }
}
