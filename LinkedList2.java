//https://leetcode.com/problems/linked-list-cycle-ii/description/

public class Solution {
    public static int lengthOfCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next !=null && fast!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                int length = 0;
                ListNode temp = head;
                do{
                    temp = temp.next;
                    length++;
                }while(temp!=slow);

                return length;
            }
        }

        return 0;
    }
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                length = lengthOfCycle(slow);
                break;
            }
        }

        if(length==0){
            return null;
        }

        fast = head;
        slow = head;

        while(length > 0){
            slow = slow.next;
            length--;
        }

        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
