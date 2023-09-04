import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            int n=sc.nextInt();
            int arr[] = new int[n];
            
            for(int i =0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < n ;i++){
                pq.add(arr[i]);
            }
            
            while(pq.size()>1){
                int stone1 = pq.poll();
                int stone2 = pq.poll();
                
                int weight = stone1 - stone2;
                
                pq.add(weight);
            }
            
            System.out.println(pq.peek());
        }
    }
}