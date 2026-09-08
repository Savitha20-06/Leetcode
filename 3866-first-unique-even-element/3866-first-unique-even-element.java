class Solution 
{
    public int firstUniqueEven(int[] nums) 
    {
        int n=nums.length;
        int sum=-1;
        for(int i=0;i<n;i++)
        {
            boolean b=true;
            for(int j=0;j<n;j++)
            {
                if( i!=j && nums[j]==nums[i])
                {
                    b=false;
                    break;
                }
            }
            if(b)
            {
                if(nums[i]%2==0)
                {
                    sum=nums[i];
                    break;
                }
            }
        }
        return sum;
    }
}