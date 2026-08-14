class Solution 
{
    public long findTheArrayConcVal(int[] nums) 
    {
        int n=nums.length;
        int right=n-1;
        long sum=0;
        for(int i=0;i<n/2;i++)
        {
            String res=""+nums[i]+nums[right];
            Long num=Long.parseLong(res);
            sum=sum+num;
            right--;
        }
        if(n%2!=0)
            sum=sum+nums[n/2];
        return sum;
    }
}