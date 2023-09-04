import java.util.*;
class Main{
public static boolean Check(String input){
    Stack<Character> stk = new Stack<>();
    for(char ch : input.toCharArray())
    {

        if(ch =='{')
        stk.push('}');
        else if(ch == '(')
        stk.push(')');
        else if(ch == '[')
        stk.push(']');
        else if(stk.isEmpty() || stk.pop()!=ch)
        return false;
    }
    return stk.isEmpty();
}
    public static void main(String[] args) {
        int tc;
        Scanner sc = new Scanner(System.in);
        tc = sc.nextInt();
        while(tc-->0)
        {
            String input;
            input = sc.next();
           if(Check(input) == true){
               System.out.println("Yes");
           }
           else{
               System.out.println("No");
           }
           }
    }
}