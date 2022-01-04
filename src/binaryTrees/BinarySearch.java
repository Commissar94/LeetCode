package binaryTrees;

public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {-1,0,3,5,9,12};

        int result = search(numbers, 2);

        System.out.println(result);
    }


    public static int search(int[] nums, int target) {

        int firstElement = 0;
        int lastElement = nums.length-1;

        while (firstElement < lastElement) {
            int middle = firstElement + lastElement / 2;

            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                firstElement = middle + 1;
            } else {
                lastElement = middle - 1;
            }
        }
        return -1;
    }
}
