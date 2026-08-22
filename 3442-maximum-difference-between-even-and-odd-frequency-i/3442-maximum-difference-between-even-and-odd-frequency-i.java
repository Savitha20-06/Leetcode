class Solution 
{
    public int maxDifference(String s) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int[] res=new int[map.size()];
        int index=0;
        for(int num:map.values())
        {
            res[index++]=num;
        }
        Arrays.sort(res);
        int even=0;
        int odd=0;
        for(int i=0;i<res.length;i++)
        {
            if(res[i]%2==0)
            {
                even=res[i];
                break;
            }
        }
        for(int i=res.length-1;i>=0;i--)
        {
            if(res[i]%2!=0)
            {
                odd=res[i];
                break;
            }
        }
        return odd-even;
    }
}