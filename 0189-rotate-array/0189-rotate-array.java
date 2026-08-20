class Solution 
{
    public void rotate(int[] nums,int l,int r)
    {
        while(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) 
    { 
        int n=nums.length;
        k=k%n;
        if(k==0)
        return;
        rotate(nums,0,n-1);
        rotate(nums,0,k-1);
        rotate(nums,k,n-1);
        return;
    }
}
