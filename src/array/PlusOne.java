package array;

import java.math.BigInteger;

public class PlusOne {

    public static void main(String[] args) {
        plusOne(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6});
    }

    public static int[] plusOne(int[] digits) {

        StringBuilder number = new StringBuilder();

        for (int digit : digits) {
            number.append(digit);
        }
        BigInteger numberPlusOne = new BigInteger(String.valueOf(number));
        numberPlusOne = numberPlusOne.add(BigInteger.valueOf(1));
        char[] digitsOfNumberPlusOne = ("" + numberPlusOne).toCharArray();
        int[] output = new int[digitsOfNumberPlusOne.length];
        for (int i = 0; i < digitsOfNumberPlusOne.length; i++) {
            output[i] = Character.getNumericValue(digitsOfNumberPlusOne[i]);
        }
        return output;
    }
}

/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
 */