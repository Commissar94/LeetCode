/*
You are given a string s.

Your task is to remove all digits by doing this operation repeatedly:

Delete the first digit and the closest non-digit character to its left.
Return the resulting string after removing all digits.
 */

public class $3174 {
    public static void main(String[] args) {

        System.out.println(clearDigits("1"));
        System.out.println(clearDigits("1a"));
        System.out.println(clearDigits("abc"));
        System.out.println(clearDigits("cb35"));
    }

    public static String clearDigits(String s) {

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                if (i-1 >= 0){
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i-1);
                    i = 0;
                } else sb.deleteCharAt(i);
            }
        }

        return sb.toString();
    }
}
