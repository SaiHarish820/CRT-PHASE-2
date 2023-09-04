import java.util.*;

class Main {
    static int mincost(PriorityQueue<Integer> chain){
        int totalcost = 0;
        while(chain.size() > 1){
            int small1 = chain.poll();
            int small2 = chain.poll();
            
            int cost = small1 + small2;
            totalcost += cost;
            chain.add(cost);
        }
        return totalcost;
    }
    
    public static void main(String[] args) {
        int tc;
        Scanner sc = new Scanner(System.in);
        tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            PriorityQueue<Integer> chain = new PriorityQueue<>();
            for(int i=0 ; i<n ; i++){
                int input = sc.nextInt();
                chain.add(input);
            }
            System.out.println(mincost(chain));
        }
    }
}