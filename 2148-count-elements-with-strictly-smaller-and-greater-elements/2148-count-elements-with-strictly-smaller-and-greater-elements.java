class Solution 
{
    public int countElements(int[] nums) 
    {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            boolean b1=false;
            boolean b2=false;
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if(nums[j]<num)
                    {
                        b1=true;
                    }
                    if(nums[j]>num)
                    {
                        b2=true;
                    }
                }
            }
            if(b1 && b2)
            c++;
        }
        return c;
    }
}