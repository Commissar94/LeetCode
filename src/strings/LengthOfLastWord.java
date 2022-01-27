package strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord("s ss"));
        System.out.println(lengthOfLastWord(" s"));
    }

    public static int lengthOfLastWord(String s) {

        String[] words = s.split(" +");
        return words[words.length-1].length();
    }
}

/*
Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
 */