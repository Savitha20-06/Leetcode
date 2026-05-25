class Solution 
{
    public int findKthLargest(int[] arr, int k) 
    {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int num:arr)
        {
            q.offer(num);
            if(q.size()>k)
            {
                q.poll();
            }
        }
        return q.peek();
    }
}