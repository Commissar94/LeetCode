import java.util.Arrays;

public class $1769_Minimum_number_of_operations {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(minOperations("110")));
        System.out.println(Arrays.toString(minOperations("001011")));
    }

    public static int[] minOperations(String boxes) {
        int[] output = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {
            int currentActions = 0;
            if (i == 0) {
                currentActions += goRight(boxes, i);
                output[i] = currentActions;
            } else if (i == boxes.length() - 1) {
                currentActions += goLeft(boxes, i);
                output[i] = currentActions;
            } else {
                currentActions += goLeft(boxes, i);
                currentActions += goRight(boxes, i);
                output[i] = currentActions;
            }
        }
        return output;
    }

    public static int goRight(String boxes, int i) {
        int actions = 0;
        for (int j = i; j < boxes.length(); j++) {
            if (boxes.charAt(j) == '1') actions += j - i ;
        }
        return actions;
    }

    public static int goLeft(String boxes, int i) {
        int actions = 0;
        for (int j = i - 1; j >= 0; j--) {
            if (boxes.charAt(j) == '1') actions += i - j;
        }
        return actions;
    }
}
