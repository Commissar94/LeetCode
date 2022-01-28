package strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());

        return sb.toString().equals(sb.reverse().toString());
    }
}

/*
125. Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 */