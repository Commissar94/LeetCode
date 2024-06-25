/*
Given two integers, num and t. A number is achievable if it can become equal to num after applying the following operation:

Increase or decrease the number by 1, and simultaneously increase or decrease num by 1.
Return the maximum achievable number after applying the operation at most t times.
 */

public class $2769_FindTheMaximumAchievableNumber {
    public static void main(String[] args) {

        System.out.println(theMaximumAchievableX(4, 1));
        System.out.println(theMaximumAchievableX(3, 2));
    }

    public static int theMaximumAchievableX(int num, int t) {

        for (int i = 0; i < t; i++) {
            num = num + 2;
        }

        return num;
    }
}

//leetcode why...