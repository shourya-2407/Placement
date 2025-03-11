/**
 Easy Peasy
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}

// After a lot of brain storming followed by a proud smile on 10th Mar
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = node;
        node = node.next;

        while(node.next != null){
            prev.val = node.val;
            prev = prev.next;
            node = node.next;
        }
        prev.val = node.val;
        prev.next = null;
    }
}
