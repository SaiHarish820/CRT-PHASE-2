import java.util.*;
class Main {
    public static void main(String[] args) {
        int tc;
        Scanner sc= new Scanner(System.in);
        tc=sc.nextInt();
        while(tc-->0){
            int num;
            num=sc.nextInt();
            PriorityQueue<Integer> pqmin = new PriorityQueue<>();
            PriorityQueue<Integer> pqmax = new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0 ; i< num ; i++)
            {
            int x = sc.nextInt();
            if(pqmax.size() == 0 ){
                pqmax.add(x);
            }
            else
            {
                if(pqmax.peek() < x) pqmin.add(x);
            else pqmax.add(x);
            }
            
            if(Math.abs(pqmax.size()-pqmin.size()) > 1){
                if(pqmax.size() > pqmin.size()){
                    pqmin.add(pqmax.remove());
                }
                else{
                    pqmax.add(pqmin.remove());
                }
            }
            
            if(pqmin.size() > pqmax.size())
            {
                System.out.printf("%.2f" , (float)pqmin.peek());
                System.out.print(" ");
            }
            else if(pqmin.size() < pqmax.size())
            {
                System.out.printf("%.2f" , (float)pqmax.peek());
                System.out.print(" ");
            }
            else if(pqmin.size() == pqmax.size()){
                System.out.printf("%.2f" , (float)((pqmin.peek()+pqmax.peek())/2.0));
                System.out.print(" ");
            }
        }
    }
}
}