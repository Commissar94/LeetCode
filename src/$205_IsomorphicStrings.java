import java.util.HashMap;

/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 */
public class $205_IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); //true e-a, g-d, g-d
        System.out.println(isIsomorphic("foo", "bar")); //false f-b, o-a, o-r
        System.out.println(isIsomorphic("paper", "title")); //true p-t,a-i,p-t,e-l,l-e
        System.out.println(isIsomorphic("bbbaaaba", "aaabbbba")); //false
        System.out.println(isIsomorphic("a", "a"));
        System.out.println(isIsomorphic("ab", "ab"));
        System.out.println(isIsomorphic("papap", "titii")); //false p-t,a-i,p-t,a-i,p-i
        System.out.println(isIsomorphic("badc", "baba")); //false b-b,a-a,d-b,c-a
        System.out.println(isIsomorphic("egcd", "adfd")); //false e-a,g-d,c-f,d-d
        System.out.println(isIsomorphic("abab", "baba")); //true a-b,b-a,a-b,b-a



    }

    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();

        if (s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for (int i = 0; i < sArr.length; i++) {

            if (map.containsKey(sArr[i]) && !map.get(sArr[i]).equals(tArr[i])) {
                return false;
            }

            if (map.containsValue(tArr[i]) && !map.containsKey(sArr[i])){
                return false;
            }
            map.put(sArr[i], tArr[i]);
        }
        return true;
    }
}
