
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
	public SLLNode mergeTwoSortedLists(SLLNode A, SLLNode B) {
	    
	    // Brute-Force Method
	   /* List<Integer> list = new ArrayList<>();
	    
	    while(A!=null){
	        list.add(A.data);
	        A = A.next; 
	    }
	    
	    while(B!=null){
	        list.add(B.data);
	        B = B.next;
	    }
	    
	    Collections.sort(list);
	    
	    
	    SLLNode ans = new SLLNode(-1);
	    SLLNode temp = ans;
	    
	    for(int i = 0 ; i < list.size() ; i++ ){
	        ans.next = new SLLNode(list.get(i));
	        ans = ans.next;
	    }
	    
	    temp = temp.next;
	    
	    
	    return ans; */
	    
	    
	    // Pointer Method
	    
	    SLLNode p1 = A;
	    SLLNode p2 = B;
	    SLLNode dummy = new SLLNode(-99);
	    SLLNode p3 = dummy;
	    
	    while(p1!=null && p2!=null){
	        if(p1.data < p2.data){
	            p3.next = p1;
	            p1 = p1.next;
	        }
	        else{
	            p3.next = p2;
	            p2 = p2.next;
	        }
	        p3 = p3.next;
	    }
	    
	    while(p1!=null){
	        p3.next = p1;
	        p1 = p1.next;
	        p3 = p3.next;
	    }
	    while(p2!= null){
	        p3.next = p2;
	        p2 = p2.next;
	        p3 = p3.next;
	    }
	    
	    return dummy.next;
	    
	    
	    
		
	}
}