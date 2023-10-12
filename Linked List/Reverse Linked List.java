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
	SLLNode sortList(SLLNode h){
// Pointer Method
/*
	    SLLNode prev_p = null;
	    SLLNode curr_p = h;
	    SLLNode next_p;
	    
	    while(curr_p!=null){
	        next_p = curr_p.next;
	        curr_p.next = prev_p;
	        
	        prev_p = curr_p;
	        curr_p = next_p;
	    }
	    return prev_p; */
	    
	    // Recursive Method
	    
	    
	    if(h == null || h.next == null){
	        return h;
	    }
	    
	    SLLNode newhead = sortList(h.next);
	    h.next.next = h;
	    h.next = null;
	    
	    return newhead;
	    
	
	}
}
