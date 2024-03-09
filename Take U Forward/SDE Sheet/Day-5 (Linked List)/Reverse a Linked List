/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//Recursive
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
       
        ListNode newHead = reverseList(head.next);
        ListNode tmp = head.next;
        tmp.next = head;
        head.next = null;
        
        return newHead;
    }
}

//Iterative
class Solution {
    public ListNode reverseList(ListNode head) {
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
}
