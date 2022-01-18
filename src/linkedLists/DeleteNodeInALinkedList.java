package linkedLists;

public class DeleteNodeInALinkedList {
    public static void main(String[] args) {

        ListNode fourth = new ListNode(9);
        ListNode third = new ListNode(1, fourth);
        ListNode second = new ListNode(5, third);
        ListNode first = new ListNode(4, second);
        System.out.println(first);
        deleteNode(third);
        System.out.println(first);
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

/*
Write a function to delete a node in a singly-linked list.
You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.

It is guaranteed that the node to be deleted is not a tail node in the list.
 */