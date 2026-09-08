class Solution 
{
    public boolean isMiddleElementUnique(int[] nums) 
    {
        int num=nums[nums.length/2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getKey()==num)
            {
                int c=entry.getValue();
                if(c==1)
                return true;
            }
        }
        return false;
    }
}