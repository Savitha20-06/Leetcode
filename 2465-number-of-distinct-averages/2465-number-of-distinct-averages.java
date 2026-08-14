class Solution 
{
    public int distinctAverages(int[] nums) 
    {
        HashSet<Float> set=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        int right=n-1;
        for(int i=0;i<n/2;i++)
        {
            float avg=(nums[i]+nums[right])/2.0f;
            set.add(avg);
            right--;
        }
        return set.size();
    }
}