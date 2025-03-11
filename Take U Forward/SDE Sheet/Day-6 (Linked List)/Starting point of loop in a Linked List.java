/**
Logic: 
  L1 = distance from head to start of cycle
  L2 = distance from start of the cycle to meeting point of slow and fast pointer
  C = total cycle length

  distance traversed by slow pointer = L1 + L2
  distance traversde by fast pointer = L1 + n*C + L2 

  fast = 2 * slow
  L1 + n*C + L2 = 2(L1 + L2)
  L1 = nC - L2

  since L2 => distance from start of the cycle to meeting point
  what is nC - L2 => distance from meeting point to start of cycle.(remaining part of cycle)
  which is then equal to L1

  so keep a pointer at head, keep a pointer at meeting point 
  they'll meet again at starting point of cycle

 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                break;
            }
        }

        if(fast == null || fast.next == null){
            return null;
        }
        
        while(head != slow){
            head = head.next;
            slow = slow.next;
        }

        return head;
    }
}
