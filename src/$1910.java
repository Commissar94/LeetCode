/*
Given two strings s and part, perform the following operation on s until all occurrences of the substring part are removed:

Find the leftmost occurrence of the substring part and remove it from s.
Return s after removing all occurrences of part.

A substring is a contiguous sequence of characters in a string.
 */

public class $1910 {
    public static void main(String[] args) {

        System.out.println(removeOccurrences("daabcbaabcbc","abc"));
        System.out.println(removeOccurrences("axxxxyyyyb","xy"));
        System.out.println(removeOccurrences("aabababa","aba")); // aABAbaba -> ABAba -> ba
    }

    public static String removeOccurrences(String s, String part) {

        boolean found = true;

        while (found) {
            if (!s.contains(part)){
                found = false;
            }
           s =  s.replaceFirst(part,"");
        }
        return s;
    }
}
