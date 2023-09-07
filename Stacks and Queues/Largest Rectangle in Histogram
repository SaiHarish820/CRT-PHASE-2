import java.util.*;

class Main {
    
    // Function to calculate the largest rectangle area in a histogram
    public static int largestArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            // While the stack is not empty and the current height is less than the height at the top of the stack
            while (!s.isEmpty() && heights[i] < heights[s.peek()]) {
                int height = heights[s.pop()]; // Pop the height at the top of the stack
                int width = s.isEmpty() ? i : i - s.peek() - 1; // Calculate the width of the rectangle

                // Calculate the area using the popped height and width, and update the maximum area
                max = Math.max(max, height * width);
            }
            s.push(i); // Push the current index onto the stack
        }

        // After processing all heights, there might be remaining elements in the stack
        while (!s.isEmpty()) {
            int height = heights[s.pop()]; // Pop the height at the top of the stack
            int width = s.isEmpty() ? n : n - s.peek() - 1; // Calculate the width of the remaining rectangle

            // Calculate the area using the popped height and width, and update the maximum area
            max = Math.max(max, height * width);
        }

        return max; // Return the maximum area
    }

    public static void main(String[] args) {
        int tc;
        Scanner sc = new Scanner(System.in);
        tc = sc.nextInt(); // Read the number of test cases

        while (tc-- > 0) {
            int n = sc.nextInt(); // Read the size of the array
            int heights[] = new int[n];

            // Read the heights of the histogram bars
            for (int i = 0; i < n; i++) {
                heights[i] = sc.nextInt();
            }

            // Calculate and print the largest rectangle area for the current test case
            int ans = largestArea(heights);
            System.out.println(ans);
        }
        sc.close();
    }
}
