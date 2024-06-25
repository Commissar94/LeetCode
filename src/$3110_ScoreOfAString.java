/*
You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

Return the score of s.
 */


public class $3110_ScoreOfAString {
    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
        System.out.println(scoreOfString("zaz"));
    }


    public static int scoreOfString(String s) {

        int score = 0;

        for (int i = 1; i < s.length(); i++) {
            score += Math.abs(s.charAt(i - 1) - s.charAt(i));
        }
        return score;
    }
}

