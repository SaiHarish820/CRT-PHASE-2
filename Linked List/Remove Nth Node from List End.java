
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class SLLNode{
	int data;
	SLLNode next;
	SLLNode(int d){
		data = d;
		next = null;
	}
};

class BeingZero{
	public SLLNode removeNthFromEnd(SLLNode A, int B) {
	    
	    
	    SLLNode dummy = new SLLNode(-1);
	    int size = 0;
	    SLLNode temp = A;
	    while(temp!=null)
	    {
	    temp = temp.next;
	    size++;
	    }
	    
	    dummy.next = A;
	    if(size == 0) return null;
	    if(B > size) B = size;
	    
	    
	    SLLNode slow = dummy;
	    SLLNode fast = dummy;
	    
	    for(int i = 0 ; i < B ; i++){
	        fast = fast.next;
	    }
	    
	    while(fast.next!=null){
	        slow = slow.next;
	        fast = fast.next;
	    }
	    
	    slow.next = slow.next.next;
	    
	    
	    return dummy.next;
	}
}