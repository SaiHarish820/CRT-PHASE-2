
#include <bits/stdc++.h>
using namespace std;

struct SLLNode{
	int data;
	struct SLLNode *next;
	SLLNode(int d){
		data = d;
		next = NULL;
	}
};

class BeingZero{
public:
	
	SLLNode* solve(SLLNode* h) {
        // TODO:  Complete this function
        // Do not read any input, use the List passed in as function input parameter
        // Do not print any output
        // Just return head, after completing the function
        // Do it in CONSTANT space
        
        SLLNode* p1 = h ; 
        SLLNode* p2 = h;
        
        while(p1 != NULL){
            if(p1->data == 0){
                swap(p1->data , p2->data);
                p2 = p2->next;
            }
            
            p1 = p1->next;
        }
        
        return h;
	}
};