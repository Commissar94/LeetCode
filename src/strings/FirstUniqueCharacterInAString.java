package strings;

public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            boolean uniq = true;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j] && i != j) {
                    uniq = false;
                    break;
                }
            }
            if (uniq) return i;
        }
        return -1;
    }
}

/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 */