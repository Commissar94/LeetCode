package linkedLists;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1, (new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))))))));

//        ListNode l1 = new ListNode();
//        ListNode l2 = new ListNode(1);[9]
//[1,9,9,9,9,9,9,9,9,9] 9

        ListNode output = addTwoNumbers(l1, l2);

        System.out.println(output);
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1.val == 0 && l2.val == 0 && l1.next == null && l2.next == null) {
            return new ListNode();
        }

        long firstNumber = nodeToNumber(l1);
        long secondNumber = nodeToNumber(l2);

        long result = firstNumber + secondNumber;

        ListNode outputListNode = new ListNode(0);
        ListNode temp = outputListNode;
        while (result > 0) {
            temp.next = new ListNode((int) (result % 10));
            result /= 10;
            temp = temp.next;
        }
        return outputListNode.next;
    }

    public static long nodeToNumber(ListNode node) {

        long output = 0;
        double multiplier = 1;

        while (node.next != null) {
            output += node.val * multiplier;
            multiplier *= 10;
            node = node.next;
        }
        output += node.val * multiplier;
        return output;
    }




//    public static int reverseNumber(int number) {
//        int reversed = 0;
//        while (number != 0) {
//            int digit = number % 10;
//            reversed = reversed * 10 + digit;
//            number = number / 10;
//        }
//        return reversed;
//    }
}
