package linkedLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

        ListNode firstNodeOfFirstLinkedList = new ListNode(1, (new ListNode(3, new ListNode(5))));

        ListNode firstNodeOfSecondLinkedList = new ListNode(2, (new ListNode(4, new ListNode(6))));

        ListNode firstNodeOfThirdLinkedList = new ListNode(2, (new ListNode(6)));

        System.out.println(mergeTwoLists(firstNodeOfFirstLinkedList, firstNodeOfSecondLinkedList));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> listOfNodeValues = new ArrayList<>();
        List<ListNode> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);

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
