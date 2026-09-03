class Solution
{
    public boolean uniformArray(int[] nums)
    {
        int min=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
        }

        if(min%2!=0)
            return true;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
                return false;
        }

        return true;
    }
}