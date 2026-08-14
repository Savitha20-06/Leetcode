class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        Arrays.sort(nums);
        int sum=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            {
                sum=nums[i-1];
                break;
            }
        }
        return sum;
    }
}