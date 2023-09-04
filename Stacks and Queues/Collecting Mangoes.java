import java.util.*;
class Main {
    public static void main(String[] args) {
        int tc;
        Scanner sc = new Scanner(System.in);
        tc = sc.nextInt();
        for(int j=1; j<=tc; j++)
        {
            System.out.println("Case " + j +":");
            int limit=sc.nextInt();
            Stack<Integer> s = new Stack<>();
            for(int i=0; i<limit; i++){
        String input=sc.next();
        
        if(input.equals("A")){
            int number = sc.nextInt();
            s.push(number);
        }
        else if(input.equals("Q"))
        {
            if(s.isEmpty()){
                System.out.println("Empty");
            }
            else{
            int max= Integer.MIN_VALUE;
            for(Integer num : s){
                if(num > max)
                {
                    max = num;
                }
            }
            System.out.println(max);
            }
            }
        else if(input.equals("R")){
            if(!s.isEmpty()){
              s.pop();
        }
 
            }
        }
    }
}
}