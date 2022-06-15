package DataStructureI;

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class RansomNote {

    public static void main(String[] args) {

        String magazine = "aab";
        String ransomNote = "aa";

        String magazine2 = "ab";
        String ransomNote2 = "aa";


        System.out.println(canConstruct(ransomNote, magazine)); // true
        System.out.println(canConstruct(ransomNote2, magazine2)); //false

    }


    public static boolean canConstruct(String ransomNote, String magazine) {


        List<Character> magazineSortedListOfChars = magazine.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> ransomNoteSortedListOfChars = ransomNote.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        for (Iterator<Character> iterator = ransomNoteSortedListOfChars.listIterator(); iterator.hasNext(); ) {
            Character ch = iterator.next();
            if (magazineSortedListOfChars.contains(ch)) {
                iterator.remove();
                magazineSortedListOfChars.remove(ch);
            }
        }

        return ransomNoteSortedListOfChars.size() == 0;
    }
}
