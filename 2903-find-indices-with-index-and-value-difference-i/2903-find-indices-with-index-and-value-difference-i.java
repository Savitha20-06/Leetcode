class Solution 
{
    public int[] findIndices(int[] nums, int index, int value) 
    {
        int[] res=new int[2];
        res[0]=-1;
        res[1]=-1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
            {
           int d1=Math.abs(i-j);
           int d2=Math.abs(nums[i]-nums[j]);
           if(d1>=index && d2>=value)
           {
              res[0]=i;
              res[1]=j;
           }
            }
        }
        return res;
    }
}