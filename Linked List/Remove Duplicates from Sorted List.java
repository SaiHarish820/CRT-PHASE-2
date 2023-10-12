
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
	public SLLNode removeDuplicates(SLLNode A) {
	    if(A == null)  return null;
	    SLLNode curr = A;
	    
	   while(curr!=null && curr.next!=null ){
	       if(curr.data == curr.next.data){
	           curr.next = curr.next.next;
	       }
	       else{
	           curr = curr.next;
	       }
	   }
	    return A;
	    

	}
}