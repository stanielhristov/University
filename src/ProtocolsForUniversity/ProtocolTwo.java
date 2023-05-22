package ProtocolsForUniversity;

import java.util.Scanner;

public class ProtocolTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your three names and faculty number: ");
        String name = scanner.nextLine();

        System.out.println("Enter the full name of the university: ");
        String university = scanner.nextLine();

        System.out.println("Enter the full name of the specialty: ");
        String major = scanner.nextLine();

        System.out.println("Enter a book title (up to 20 characters): ");
        String bookTitle = scanner.nextLine();

        System.out.println("Enter a movie title (up to 20 characters): ");
        String movieTitle = scanner.nextLine();

        System.out.println("Enter any word missing from the strings above: ");
        String missingWord = scanner.nextLine();

        System.out.println("Enter any word that is repeated in the strings above: ");
        String repeatedWord = scanner.nextLine();

        System.out.println("String 1: " + name);
        System.out.println("String 2: " + university);
        System.out.println("String 3: " + major);
        System.out.println("String 4: " + bookTitle);
        System.out.println("String 5: " + movieTitle);
        System.out.println("String 6: " + missingWord);
        System.out.println("String 7: " + repeatedWord);

        if (name.contains(missingWord) || university.contains(missingWord) || major.contains(missingWord) || bookTitle.contains(missingWord) || movieTitle.contains(missingWord)) {
            System.out.println("The word '" + missingWord + "' is present in one or more of the above strings.");
        } else {
            System.out.println("The word '" + missingWord + "' is not present in any of the above strings.");
        }

        if (name.contains(repeatedWord) || university.contains(repeatedWord) || major.contains(repeatedWord) || bookTitle.contains(repeatedWord) || movieTitle.contains(repeatedWord)) {
            System.out.println("The word '" + repeatedWord + "' is present in one or more of the above strings.");
        } else {
            System.out.println("The word '" + repeatedWord + "' is not present in any of the above strings.");
        }


        int countMissingWord = 0;
        int countRepeatedWord = 0;
        boolean isMissingWordThere = false;
        boolean isRepeatedWordThere = false;

        String[] strings = {name, university, major, bookTitle, movieTitle};

        for (String word: strings) {
            if (word.contains(missingWord)) {
                countMissingWord ++;
                isMissingWordThere = true;
            }

            if (word.contains(repeatedWord)) {
                countRepeatedWord ++;
                isRepeatedWordThere = true;
            }
        }


        if (isMissingWordThere) {
            System.out.println("The word '" + missingWord  + "' occurs " + countMissingWord + " time(s) in all strings above.");
        }

        if (isRepeatedWordThere) {
            System.out.println("The word '" + repeatedWord  + "' occurs " + countRepeatedWord + " time(s) in all strings above.");
        }



    }
}