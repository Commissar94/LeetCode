/*
In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
The twin sum is defined as the sum of a node and its twin.

Given the head of a linked list with even length, return the maximum twin sum of the linked list.
 */

import ListNode.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class $2130_Maximum_Twin_Sum {

    public static void main(String[] args) {

        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(pairSum(head));

    }


    public static int pairSum(ListNode head) {

        Deque<Integer> deque = new ArrayDeque<>();
        int maxSum = 0;
        int curSum = 0;

        while (head != null){
            deque.add(head.val);
            head = head.next;
        }
        while (!deque.isEmpty()){
            curSum = deque.removeFirst() + deque.removeLast();
            if (curSum > maxSum) maxSum = curSum;
        }

        return maxSum;
    }
}
