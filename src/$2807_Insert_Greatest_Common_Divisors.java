import ListNode.ListNode;

public class $2807_Insert_Greatest_Common_Divisors {

    public static void main(String[] args) {

        ListNode input = new ListNode(18);
        input.next = new ListNode(6);
        input.next.next = new ListNode(10);
        input.next.next.next = new ListNode(3);

        System.out.println(insertGreatestCommonDivisors(input));

    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            int gcdValue = gcd(curr.val, curr.next.val);
            ListNode newNode = new ListNode(gcdValue);

            newNode.next = curr.next;
            curr.next = newNode;

            curr = newNode.next;
        }
        return head;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
