import java.util.*;
class Main {
    public static void main(String[] args) {
        int tc;
        Scanner sc = new Scanner(System.in);
        tc = sc.nextInt();
        while(tc-->0){
            int n;
            n = sc.nextInt();
            int arr[] = new int[n];
            int output[] = new int[n];
            for(int i = 0 ;  i < n ; i++){
                arr[i] = sc.nextInt();
            }
            Stack<Integer> s = new Stack<>();
            for(int i = n-1; i>=0 ; i--)
            {
                while(!s.empty() && arr[s.peek()] <= arr[i])
                {
                    s.pop();
                }
                if(!s.empty()){
                    output[i] = s.peek() - i ; 
                }
                else{
                    output[i] = 0;
                }
                s.push(i);
            }
            
            for(int k=0;k<n;k++){
                System.out.print(output[k]+ " ");
            }
            System.out.println();
        }
}
}