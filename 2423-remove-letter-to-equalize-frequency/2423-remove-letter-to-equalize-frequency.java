class Solution
{
    public boolean equalFrequency(String word) 
    {
        char[] ch=word.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:ch)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
         for(char c : map.keySet())
        {
            map.put(c, map.get(c) - 1);

            int freq = -1;
            boolean b = true;

            for(int n : map.values())
            {
                if(n == 0)
                    continue;

                if(freq == -1)
                    freq = n;
                else if(freq != n)
                {
                    b = false;
                    break;
                }
            }

            map.put(c, map.get(c) + 1);

            if(b)
                return true;
        }

        return false;
    }
}