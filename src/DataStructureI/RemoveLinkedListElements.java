package DataStructureI;

public class RemoveLinkedListElements {

    public static void main(String[] args) {

        ListNode fourth = new ListNode(9);
        ListNode third = new ListNode(1, fourth);
        ListNode second = new ListNode(5, third);
        ListNode first = new ListNode(4, second);

        System.out.println(removeElements(first, 1));


    }

    public static ListNode removeElements(ListNode head, int val) {

        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            if(curr.val == val){
                if(prev == null) {
                    head = head.next;
                }else{
                    prev.next = curr.next;
                }
            }else{
                prev = curr;
            }

            curr = curr.next;
        }
        return head;
    }

}
