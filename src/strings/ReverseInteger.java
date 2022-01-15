package strings;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        try {
            if (x < 0) return Integer.parseInt(new StringBuilder(String.valueOf(x * -1)).reverse().toString()) * -1;
            return Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
        } catch (RuntimeException e) {
            return 0;
        }
    }
}

/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */