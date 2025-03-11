/**
 Reverse the second half of linked list and then compare.
 */

class Solution {
    public ListNode reverseLinkedList(ListNode head) {
        ListNode rev = null;
        ListNode nextNode;

        while(head != null){
            nextNode = head.next;
            head.next = rev;
            rev = head;
            head = nextNode;
        }
        return rev;
    }

    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast= head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(ListNode head) {
       if(head==null || head.next==null) return true;

       ListNode mid = middle(head);
       ListNode right = reverseLinkedList(mid);
       ListNode left = head;

       while(right != null){
            if(right.val != left.val)
                return false;
            left = left.next;
            right = right.next;
       }

       return true;
    }
}
