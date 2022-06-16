package DataStructureI;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();

        while (this.next != null){
            values.add(this.val);
            this.val = this.next.val;
            this.next = this.next.next;
        }
        //values.add(this.val);

        return values;
    }
}