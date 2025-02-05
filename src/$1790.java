/*
You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.
 */

import java.util.HashSet;
import java.util.Set;

public class $1790 {
    public static void main(String[] args) {

        System.out.println(areAlmostEqual("bank","kanb"));
        System.out.println(areAlmostEqual("qgqeg","gqgeq"));
        System.out.println(areAlmostEqual("attack","defend"));
        System.out.println(areAlmostEqual("kelb","kelb"));
        System.out.println(areAlmostEqual("aa","ac"));
        System.out.println(areAlmostEqual("aa","bb"));
        System.out.println(areAlmostEqual("caa","aaz"));
        System.out.println(areAlmostEqual("xkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkx",
                "fkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkf"));
    }


    public static boolean areAlmostEqual(String s1, String s2) {

        if (s1.equals(s2)) return true;

        Set<Character> diffChars_s1 = new HashSet<>();
        Set<Character> diffChars_s2 = new HashSet<>();
        int counter = 0;

        for (int i = 0; i < s1.length(); i++) {
            char currentChar_s1 = s1.charAt(i);
            char currentChar_s2 = s2.charAt(i);

            if (currentChar_s1 != currentChar_s2) {

                counter++;
                diffChars_s1.add(currentChar_s1);
                diffChars_s2.add(currentChar_s2);
            }

            if (diffChars_s1.size() > 2) return false;
        }
        if (diffChars_s1.size() < 2 || diffChars_s2.size() < 2) return false;
        Set<Character> s1_s2 = new HashSet<>(diffChars_s1);
        s1_s2.addAll(diffChars_s2);
        return  s1_s2.size() == 2 && counter == 2;
    }
}
