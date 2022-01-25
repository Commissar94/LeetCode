package noCategory;

public class FinalValueOfVariableAfterPerformingOperations {

    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
        System.out.println(finalValueAfterOperations(new String[]{"++X","++X","X++"}));
        System.out.println(finalValueAfterOperations(new String[]{"X++","++X","--X","X--"}));
        System.out.println(finalValueAfterOperations(new String[]{}));
    }

    public static int finalValueAfterOperations(String[] operations) {

        int x = 0;

        for (String operation : operations) {
            if (operation.contains("X++") || operation.contains("++X")) x++;
            else if (operation.contains("X--") || operation.contains("--X")) x--;
        }

        return x;
    }
}



/*

#2011

There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
 */