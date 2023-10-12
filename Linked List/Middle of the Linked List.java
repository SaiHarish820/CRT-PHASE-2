import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) 
	{
		this.val = val; 
		next = null;
	}
}

class BeingZero {
    public ListNode middleNode(ListNode head) {
        if(head == null)  return null;
        int c = 0;
        ListNode t = head;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!= null ){
            slow = slow.next;
            fast = fast.next.next;
        }
       /* while(t!=null){
        c++;    t = t.next;
        }
        int jumps = c/2;
        t = head;
        
        while(jumps-->0){
            t = t.next;
        }
       
        return t; */
        return slow;
        
    }
}
