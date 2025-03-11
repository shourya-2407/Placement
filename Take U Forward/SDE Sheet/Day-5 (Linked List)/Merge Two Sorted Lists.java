// Iterative approach
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode r = res;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                r.next = list1;
                r= r.next;
                list1 = list1.next;
            } else {
                r.next = list2;
                r = r.next;
                list2 = list2.next;
            }
        }
        if(list1 != null) {
            r.next = list1;
        }
        if(list2 != null) {
            r.next = list2;
        }
        return res.next;
    }
}


// Recursive approach
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode r = res;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                r.next = list1;
                r= r.next;
                list1 = list1.next;
            } else {
                r.next = list2;
                r = r.next;
                list2 = list2.next;
            }
        }
        while(list1 != null) {
            r.next = list1;
            r = r.next;
            list1 = list1.next;
        }
        while(list2 != null) {
            r.next = list2;
            r = r.next;
            list2 = list2.next;
        }
        return res.next;
    }
}
