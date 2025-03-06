import java.util.*;

public class $2965 {
    public static void main(String[] args) {

        int[][] input = new int[][]{{1,3},{2,2}};
        int[][] input_2 = new int[][]{{9,1,7},{8,9,2},{3,4,6}};

        System.out.println(Arrays.toString(findMissingAndRepeatedValues(input)));
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(input_2)));
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        int numberSize = grid.length * grid.length;

        int expectedSum = 0;
        for (int i = 1; i <= numberSize; i++) {
            expectedSum += i;
        }

        int appearsTwice = 0;
        int missing;

        Set<Integer> numbers = new HashSet<>();
        int sum = 0;

        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (numbers.contains(anInt)) appearsTwice = anInt;
                else numbers.add(anInt);
                sum += anInt;
            }
        }

        missing = expectedSum - (sum - appearsTwice);

        return new int[]{appearsTwice,missing};
    }
}