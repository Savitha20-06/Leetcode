class Solution 
{
    public int maxFreqSum(String s) 
    {
        char[] ch=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:ch)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max=0;
        int m=0;
        for(char c:map.keySet())
        {
            if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u')
            {
                if(map.get(c)>max)
                {
                    max=map.get(c);
                }
            }
            else
            {
                if(map.get(c)>m)
                {
                    m=map.get(c);
                }
            }
        }
        return max+m;
    }
}