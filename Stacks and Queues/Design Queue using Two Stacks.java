import java.util.*;
class Main {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int num,input;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(num-->0){
            input = sc.nextInt();
                if(input==1){
                    s1.push(sc.nextInt());
                }
                else 
                {
                    if(s1.isEmpty() && s2.isEmpty())
                    {
                        System.out.print("-1 ");
                    }
                    else
                    {
                    if(!s2.isEmpty())
                    {
                        System.out.print(s2.pop() + " ");
                    }
                    else
                    {
                    while(!s1.isEmpty())
                    s2.push(s1.pop());
                    System.out.print(s2.pop() + " ");
                }
                }
            }
        }
        }
    }