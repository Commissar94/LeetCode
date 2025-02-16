public class $2114 {
    public static void main(String[] args) {



        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }

    public static int mostWordsFound(String[] sentences) {

        int maxWords = 0;

        for (String sentence : sentences){;
            int sentenceWithoutSpaces = sentence.replace(" ", "").length();
            int words = sentence.length() - sentenceWithoutSpaces + 1;
            if ( words > maxWords) maxWords = words;
        }

        return maxWords;

    }
}
