//https://leetcode.com/problems/reorder-list/description/

class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next  == null){
            return;
        }
        ListNode first = head;
        ListNode prev = null;
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;
        }

        prev.next = null;

        ListNode second = reverseLinkedList(slow);

        while(first !=null){
            ListNode first_temp = first.next;
            ListNode second_temp = second.next;

            first.next = second;

            if(first_temp == null){
                break;
            }

            second.next = first_temp;

            first = first_temp;
            second = second_temp;

        }

    }

    private ListNode reverseLinkedList(ListNode head){
        ListNode prev=null;
        ListNode pres=head;
        ListNode after=pres.next;
        while (pres!=null){
            pres.next=prev;
            prev=pres;
            pres=after;
            if (after!=null){
                after=after.next;
            }

        }

        return prev;

    } 

}
