/*
You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.

For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.

Return the head of the modified linked list.
 */

import ListNode.ListNode;

public class $2181_Merge_Nodes_in_Between_Zeroes {
    public static void main(String[] args) {

        ListNode input = new ListNode(0);
        input.next = new ListNode(3);
        input.next.next = new ListNode(1);
        input.next.next.next = new ListNode(0);
        input.next.next.next.next = new ListNode(4);
        input.next.next.next.next.next = new ListNode(5);
        input.next.next.next.next.next.next = new ListNode(2);
        input.next.next.next.next.next.next.next = new ListNode(0);

        printNodes(mergeNodes(input));
    }


    public static ListNode mergeNodes(ListNode head) {

        int currentSum = 0;
        ListNode dummy = new ListNode(0);
        ListNode output = dummy;
        head = head.next;

        while (head != null) {

            if (head.val == 0) {
                if (dummy.val == 0) {
                    dummy.val = currentSum;
                } else {
                    dummy.next = new ListNode(currentSum);
                    dummy = dummy.next;
                }
                currentSum = 0;
            } else {
                currentSum += head.val;
            }
            head = head.next;
        }

        return output;
    }

    public static void printNodes(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}