class Solution 
{
    public boolean divideArray(int[] nums) 
    {
        Arrays.sort(nums);
        int c=1;
        boolean b=true;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            {
                c++;
            }
            else
            {
                if(c%2!=0)
                {
                    b=false;
                    break;
                }
                else
                {
                    c=1;
                }
            }
        }
        return b;
    }
}