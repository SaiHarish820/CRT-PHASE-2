import java.util.*;
class Main {
    public static void main(String[] args) {
        int tc;
        Scanner sc = new Scanner(System.in);
        tc = sc.nextInt();
        while(tc-->0)
        {
            int num = sc.nextInt();
            Queue<Integer> q = new LinkedList<>();
            q.add(1);
            while(num-->0)
            {
                int x = q.remove();
                System.out.print(x + " ");
                q.add(x*10);
                q.add(x*10 + 1);
            }
            System.out.println();
        }
    }
}