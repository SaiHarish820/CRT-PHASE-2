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
    public ListNode removeElements(ListNode head, int val) {
        //create a dummy node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;
        
       while(curr.next!= null){
           
           // check if value matches
           
           if(curr.next.val == val){
               curr.next = curr.next.next; 
           }
           else{
               curr = curr.next;
           }
       }
       
       return dummy.next;
        
       
    }
}
