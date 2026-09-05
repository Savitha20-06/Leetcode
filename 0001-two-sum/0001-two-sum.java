class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i]=list.get(i);
        }

        return res;
    }
}
