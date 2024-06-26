/*
You are given a 0-indexed array of strings words and a character x.

Return an array of indices representing the words that contain the character x.

Note that the returned array may be in any order.
 */

import java.util.ArrayList;
import java.util.List;

public class $2942_FindWordsContainingCharacter {
    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[]{"leet", "code"}, 'e'));
        System.out.println(findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a'));
        System.out.println(findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'z'));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) indexes.add(i);
        }

        return indexes;
    }
}
