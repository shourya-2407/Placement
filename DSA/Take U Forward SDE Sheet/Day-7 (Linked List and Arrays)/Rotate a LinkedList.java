/**
 * Corner Cases:
 * N shifts is equivalent to zero shifts, that is no change in the list
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        ListNode endOfList = head;
        int n = 0;
        while(endOfList.next != null){
            endOfList = endOfList.next;
            n++;
        }
        n++;

        int shift = n - (k % n) - 1;

        ListNode root = head;
        while(shift != 0){
            root = root.next;
            shift-- ;
        }
        
        if(root.next == null){
            return head;
        }

        ListNode newHead = root.next;
        root.next = null;
        endOfList.next = head;

        return newHead;
    }
}
