class Solution 
{
    public int[] frequencySort(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->{
            if(a.getValue()!=b.getValue())
            return a.getValue()-b.getValue();
            else
            return b.getKey()-a.getKey();
         });
        int[] res=new int[nums.length];
        int index=0;
        for(Map.Entry<Integer,Integer>entry:list)
        {
            for(int i=0;i<entry.getValue();i++)
            {
                res[index++]=entry.getKey();
            }
        }
        return res;
    }
}