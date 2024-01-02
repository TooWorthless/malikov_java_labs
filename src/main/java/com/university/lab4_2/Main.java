package com.university.lab4_2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String encryptedMessage = "t2st3ng uftujoh";
        

        // DECODING EXAMPLE
        decodeMessage(encryptedMessage);


        System.out.println();


        // ENCODING EXAMPLE
        System.out.println("Encoded word by vowels: testing - " + Decoder.encodeVowels("testing"));
        System.out.println("Encoded word by consonants: testing - " + Decoder.encodeConsonants("testing"));
        
    }

    static void decodeMessage(String encryptedMessage) {
        String[] words = encryptedMessage.split(" ");

        int wordIndex = 1;
        for (String word : words) {
            Pattern pattern = Pattern.compile(".*\\d.*"); // for finding nembers
            Matcher matcher = pattern.matcher(word);
    
            if (matcher.matches()) {
                System.out.println("Decoded word " + wordIndex + ": " + word + " ---> " + Decoder.decodeVowels(word)); 
            } else {
                System.out.println("Decoded word " + wordIndex + ": " + word + " ---> " + Decoder.decodeConsonants(word));
            }

            wordIndex++;
        }
    }
}