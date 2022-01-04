package linkedLists;

/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending (возрастание) order.

Merge all the linked-lists into one sorted linked-list and return it.

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
 */


import java.util.*;

public class MergeSortedLists {

    public static void main(String[] args) {

        ListNode firstNodeOfFirstLinkedList = new ListNode(1, (new ListNode(4, new ListNode(5))));

        ListNode firstNodeOfSecondLinkedList = new ListNode(1, (new ListNode(3, new ListNode(4))));

        ListNode firstNodeOfThirdLinkedList = new ListNode(2, (new ListNode(6)));

        ListNode[] listOfListNodes = new ListNode[3];
        listOfListNodes[0] = firstNodeOfFirstLinkedList;
        listOfListNodes[1] = firstNodeOfSecondLinkedList;
        listOfListNodes[2] = firstNodeOfThirdLinkedList;
        System.out.println(mergeKLists(listOfListNodes));
    }

    public static ListNode mergeKLists(ListNode[] lists) {

        List<Integer> listOfNodeValues = new ArrayList<>();

        for (ListNode node : lists) {
            while (node != null) {
                listOfNodeValues.add(node.val);
                node = node.next;
            }
        }

        Collections.sort(listOfNodeValues);

        ListNode outputListNode = new ListNode(0);
        ListNode temp = outputListNode;
        for (int val : listOfNodeValues) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        return outputListNode.next;
    }

}

