package linkedLists;

public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
//        ListNode fifth = new ListNode(5);
//        ListNode fourth = new ListNode(4, fifth);
//        ListNode third = new ListNode(3, fourth);
//        ListNode second = new ListNode(2, third);
//        ListNode first = new ListNode(1, second);

//        ListNode second = new ListNode(2);
//        ListNode first = new ListNode(1, second);

        //  ListNode first = new ListNode(1);

//        ListNode third = new ListNode(3);
//        ListNode second = new ListNode(2, third);
//        ListNode first = new ListNode(1, second);

//        ListNode third = new ListNode(3);
//        ListNode second = new ListNode(2, third);
//        ListNode first = new ListNode(1, second);


        ListNode ten = new ListNode(10);
        ListNode nine = new ListNode(9, ten);
        ListNode eight = new ListNode(8, nine);
        ListNode seven = new ListNode(7, eight);
        ListNode six = new ListNode(6, seven);
        ListNode fife = new ListNode(5, six);
        ListNode four = new ListNode(4, fife);
        ListNode third = new ListNode(3, four);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        System.out.println(removeNthFromEnd(first, 7));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (head.next == null) {
            return null;
        }

        int nodes = 2;
        ListNode tempHead = head;
        while (tempHead.next.next != null) {
            nodes++;
            tempHead = tempHead.next;
        }

        if (n == nodes) {
            return head.next;
        }

        ListNode temp = head;

        for (int i = 1; i < nodes - n; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}

/*
Given the head of a linked list,
remove the nth node from the end of the list and return its head.



Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]


Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 */