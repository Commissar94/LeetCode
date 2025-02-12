import java.util.HashMap;

public class $2342 {
    public static void main(String[] args) {

        System.out.println(maximumSum(new int[]{18,43,36,13,7}));
        System.out.println(maximumSum(new int[]{10,12,19,14}));
        System.out.println(maximumSum(new int[]{4,6,10,6}));
        System.out.println(maximumSum(new int[]{18,36,27}));

    }


    public static int maximumSum(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int maxValue = -1;

        for (int num : nums){
            int currentSumOfDigits = sumOfDigits(num);

            if (map.containsKey(currentSumOfDigits)){
                int knownNumber = map.get(currentSumOfDigits);
                maxValue = Math.max(maxValue, knownNumber + num);
                map.put(currentSumOfDigits,Math.max(knownNumber, num));
            } else {
                map.put(currentSumOfDigits, num);
            }
        }

        return maxValue;
    }

    public static int sumOfDigits(int num) {
        int sumOfDigits = 0;

        while (num != 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }
        return sumOfDigits;
    }
}