import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    while(tc-->0)
    {
        String input;
        int limit = sc.nextInt();
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<limit; i++)
        {
            input = sc.next();
            if(input.equals("C"))
            {
                stk.pop();
            }
            else if(input.equals("D")){
                stk.push(stk.peek() * 2);
            }
            else if(input.equals("+")){
                int x = stk.pop();
                int y = stk.peek();
                stk.push(x);
                stk.push(x+y);
            }
            else{
                int num = Integer.parseInt(input);
                stk.push(num);
            }
        }
        int sum = 0;
        for(int x : stk)
        sum+= x;
        
        System.out.println(sum);
    }
   
    }
}