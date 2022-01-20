package strings;

import java.util.*;
import java.util.stream.Collectors;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcadd") + "\n");

        System.out.println(lengthOfLongestSubstring("abcabcbb") + "\n");

        System.out.println(lengthOfLongestSubstring("bbbbb") + "\n");

        System.out.println(lengthOfLongestSubstring("pwwkew") + "\n");

        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s.isBlank()) {
            return s.length() > 0 ? 1 : 0;
        }

        Set<Character> set = new HashSet<>();
        List<Character> chars = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        int substringCounter = 0;
        int resets = 0;
        List<Integer> listOfSubstringsCounters = new ArrayList<>();

        for (int i = 0; i < chars.size(); i++) {
            if (!set.add(chars.get(i))) {
                substringCounter = i;
                listOfSubstringsCounters.add(set.size());
                i = resets;
                resets++;
                set.clear();
            }
            if (i == chars.size() - 1 && substringCounter == 0) return s.length();
        }
        if (!set.isEmpty()) listOfSubstringsCounters.add(set.size());
        return listOfSubstringsCounters.size() > 1 ? Collections.max(listOfSubstringsCounters) : 1;
    }
}

/*
Given a string s, find the length of the longest substring without repeating characters.
 */