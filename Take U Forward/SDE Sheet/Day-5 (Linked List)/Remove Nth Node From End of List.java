// Logic
// nth element from end
// States N - n element from front
// Traverse a fast point for n iterations from front
// so fast pointer will reach end with N - n iterations
// place a slow pointer at head at the same time which stops when fast pointer reaches end
// This way slow pointer has traversed N - n iterations from front that is n iterations from back. Now delete the element.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;

        while(n > 0){
            fast = fast.next;
            n--;
        }
        //logic to remove the first element
        if(fast == null) {
            return head.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
