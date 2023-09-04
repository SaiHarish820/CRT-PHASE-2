import java.util.*;
class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;
            n = sc.nextInt();
            int arr[] = new int[n];
            int output[] = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            Stack<Integer> s = new Stack<>();
            for(int i = 0 ; i < n ; i++){
                
                while(!s.empty() && s.peek() >= arr[i] ){
                    s.pop();
                }
                if(!s.empty()){
                    output[i] = s.peek();
                }
                else{
                    output[i] = -1;
                }
                s.push(arr[i]);
            }
            
            for(int k=0 ; k<n ; k++){
                System.out.print(output[k] + " ");
            }
            System.out.println();
        }
}