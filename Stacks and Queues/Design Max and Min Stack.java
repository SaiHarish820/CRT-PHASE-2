import java.util.*;
class Main {
    
    
    public static void main(String[] args) {
        int tc;
        Scanner sc = new Scanner(System.in);
        tc = sc.nextInt();
        while(tc-->0)
        {
            Stack<Integer> max = new Stack<>();
            Stack<Integer> min = new Stack<>();
            int size = sc.nextInt();
            for(int i=0; i<size;i++){
                int input =  sc.nextInt();
                if(max.isEmpty()){
                    max.push(input);
                }
                else{
                    max.push(Math.max(max.peek(), input));
                }
                if(min.isEmpty()){
                    min.push(input);
                }
                else{
                    min.push(Math.min(min.peek(), input));
                }
            }
            
            for(int  print :  max){
                System.out.print(print + " ");
            }
            System.out.println();
            
            for(int printmin : min){
                System.out.print(printmin + " ");
            }
            System.out.println();
            System.out.println();
        
        
    }

    }
    
    }