public static long sum(Stack<Integer> st)
{
    int sum=0;
    while(!st.isEmpty())
    {
        sum+= st.pop(); 
    }
    return sum;
    
}