/*

A binary string x is valid if all
substrings
 of x of length 2 contain at least one "1".

Return all valid strings with length n, in any order.



Example 1:

Input: n = 3

Output: ["010","011","101","110","111"]

Explanation:

The valid strings of length 3 are: "010", "011", "101", "110", and "111".
 */


import java.util.ArrayList;
import java.util.List;

public class $3211_Generate_Binary_Strings {
    public static void main(String[] args) {

        System.out.println(validStrings(2));
        System.out.println(validStrings(3));
        System.out.println(validStrings(1));
        System.out.println(validStrings(4));
        System.out.println(validStrings(5));
        System.out.println(validStrings(18));
    }

    public static List<String> validStrings(int n) {

        if (n == 1) return new ArrayList<>(List.of("0","1"));
        if (n == 2) return new ArrayList<>(List.of("01","10","11"));

        List<String> output = new ArrayList<>();
        int currentNumberLength = n;
        int counter = 2;

        while (currentNumberLength < n + 1) {
            String currentNumber = Integer.toBinaryString(counter);
            currentNumberLength = currentNumber.length();

            if (currentNumberLength < n){
                currentNumber = "0" + currentNumber;
                currentNumberLength++;
            }
            if (currentNumberLength < n || currentNumber.contains("00")){
                counter++;
                continue;
            }

            output.add(currentNumber);
            counter++;
        }
        return output;
    }
}
