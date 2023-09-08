import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            Set<Integer> s = new HashSet<>();
            int arr[] = new int[n];
            for(int i = 0 ; i < n ; i++ ){
                s.add(Math.abs(arr[i]=sc.nextInt()));
            }
            System.out.println(s.size());
            
        }
    }
}