package strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        reverseString(new char[]{'p', 'o', 'v', 'a', 'a', 'r'});
        reverseString(new char[]{'p', 'o', 'v', 'a', 'r'});
        reverseString(new char[]{'h', 'a', 'n', 'n', 'a', 'h'});
        reverseString(new char[]{'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a', 'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a'});
    }

    public static void reverseString(char[] s) {

        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}

