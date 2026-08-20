class Solution 
{
    public int[] limitOccurrences(int[] nums, int k) 
    {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            int num=entry.getKey();
            int val=entry.getValue();

            int limit=Math.min(val,k);
            for(int i=0;i<limit;i++)
            {
                list.add(num);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i]=list.get(i);
        }
        Arrays.sort(res);
        return res;
    }
}