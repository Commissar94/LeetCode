/*
You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.
 */

public class $1684_Count_The_Number_Of_Consistent_Strings {

    public static void main(String[] args) {

        System.out.println(countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}));
        System.out.println(countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
        System.out.println(countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
    }

    public static int countConsistentStrings(String allowed, String[] words) {

        int counter = 0;

        for (String word : words) {
            int countChecks = 0;
            for (int j = 0; j < word.length(); j++) {
                if (allowed.contains(String.valueOf(word.charAt(j)))) countChecks++;
                else break;
            }
            if (word.length()  == countChecks) counter++;
        }

        return counter;
        }
}
