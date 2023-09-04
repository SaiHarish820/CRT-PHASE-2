import java.util.*;

class BeingZero {
    Stack<Integer> stk = new Stack<>();
    public BeingZero() {
        
    }
    
    public void push(int val) {
        // complete the push function.
        stk.push(val);
    }
    
    public void pop() {
        // complete the pop function.
        stk.pop();
    }
    
    public int top() {
        // complete the top function.
        return  stk.peek();
    }
    
    public int getMin() {
        // complete the getMin function
        Stack<Integer> temp = new Stack<>();
        int min = Integer.MAX_VALUE;
        if(stk.size() == 1)
        {
            return stk.peek();
        }
        else{
            while(!stk.isEmpty())
            {
                int x = stk.pop();
                if(x < min)
                {
                    min = x;
                }
                temp.push(x);
            }
            while(!temp.isEmpty())
            {
                stk.push(temp.pop());
            }
            return min;
            
    }
}
}

/**
 * Your BeingZero object will be instantiated and called as such:
 * BeingZero obj = new BeingZero();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */