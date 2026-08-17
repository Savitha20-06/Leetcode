class Solution 
{
    public int minimumSwaps(int[] nums)
    {
        int l=0;
        int r=nums.length-1;
        int c=0;
        while(l<=r)
        {
            if(nums[l]==0 && nums[r]!=0)
            {
                c++;
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
            }
            if(nums[l]!=0)
            l++;
            if(nums[r]==0)
            r--;
        }
        return c;
    }
}