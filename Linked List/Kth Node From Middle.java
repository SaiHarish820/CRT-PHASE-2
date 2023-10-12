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
	public int kthFromMiddle(SLLNode head, int B) {
		int len = 0;
		SLLNode temp = head;
		while(temp!=null){
		    len++;
		    temp = temp.next;
		}
		int m = len/2 + 1 ;
		int pos = m - B;
		if(pos <= 0) return -1;
		else{
		    temp = head; 
		    int count = 1 , ans = 0 ;
		    while(temp!=null){
		        if(count == pos){
		            ans = temp.data;
		            break;
		        }
		        count++;
		        temp = temp.next;
		    }
		    return ans;
		}
}
}