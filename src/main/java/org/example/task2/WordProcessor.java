package org.example.task2;

import java.util.Scanner;

//Create a class that will do the following:
//     Ask user to input the number of words to be processed
//     Ask user to input words, one by one; the expected number of words should be the one specified in the first step
//     Determine and print the word to the console that has the least amount of different symbols in it
//     For example, specified words: test, racer, car, shopping
//     The word that should be printed is "test" because: it has only 3 unique symbols/chars
//     If there are two words with the same amount of unique chars, like in the e.g. "test" and "car", we print the one that comes first in the list

public class WordProcessor {
    public static void main(String[] args) {
        Scanner scun = new Scanner(System.in);
        System.out.print("Input the number of words to be processed: ");
        while (!scun.hasNextInt()) {
            System.out.println("Should be integer");
            System.out.print("Input the number of words to be processed: ");
            scun.nextLine();

        }

        int number = scun.nextInt();

        String[] words = new String[number];


        for (int i = 0; i < number; i++) {
            System.out.print("Input the word: ");
            String word = scun.next();
            words[i] = word;

            System.out.println(countUniqueCharsFor(word));

        }
        scun.close();
        System.out.println(findLessUniqueCharsWordFor(words));
    }


    public static String findLessUniqueCharsWordFor(String[] words) {
        String potentialLessCharsWord = words[0];
        int numberOfUniqueChars = countUniqueCharsFor(potentialLessCharsWord);
        for (int i = 1; i < words.length; i++) {
            if (countUniqueCharsFor(words[i]) < numberOfUniqueChars) {
                numberOfUniqueChars = countUniqueCharsFor(words[i]);
                potentialLessCharsWord = words[i];
            }
        }
        return potentialLessCharsWord;
    }

    public static int countUniqueCharsFor(String word) {
        boolean isUnique;
        int uniqueCount = 0;
        for (int i = 0; i < word.length(); i++) {
            isUnique = true;
            for (int j = 0; j < i; j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }
        return uniqueCount;
    }


}
