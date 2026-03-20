class Solution 
{
    public int[] dailyTemperatures(int[] arr) 
    {
        Stack<Integer> s=new Stack<>();
        int n=arr.length;
        int[] res=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                res[i]=0;
            }
            else
            {
                res[i]=s.peek()-i;
            }
            s.push(i);
        }
        return res;
    }
}