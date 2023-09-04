import java.util.*;

class Main{
public static int[] NextGreater(int arr[], int size){
    int output[]=new int[size];
    Stack<Integer> s = new Stack<>();
   for(int i = size-1 ; i >=0 ; i--){
       while(!s.empty() && s.peek() <= arr[i])
       {
           s.pop();
       }
           if(i  < size){
               if(!s.empty()){
               output[i] = s.peek();
               }
           else
           {
               output[i]=-1;
           }
           }
               s.push(arr[i%size]);
   }
       return output;
   }
    public static void main(String[] args) {
        int tc;
        Scanner sc = new Scanner(System.in);
        tc = sc.nextInt();
        while(tc-->0){
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int i=0; i<size ; i++){
                arr[i]=sc.nextInt();
            }
            int ans[] = NextGreater(arr,size);
            for(int k=0; k<size; k++){
                System.out.print(ans[k] + " ");
            }
            System.out.println();
        }
    }
}