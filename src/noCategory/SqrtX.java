package noCategory;

public class SqrtX {
    public static void main(String[] args) {

        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(16));
        System.out.println(mySqrt(17));
        System.out.println(mySqrt(24));
        System.out.println(mySqrt(26));
        System.out.println(mySqrt(0));
        System.out.println(mySqrt(1024));
        System.out.println(mySqrt(2147483647));


    }

    public static int mySqrt(int x) {
        long y = x;
        while (y * y > x)
            y = (y + x / y) / 2;
        return (int) y;
    }
}

/*
Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
 */