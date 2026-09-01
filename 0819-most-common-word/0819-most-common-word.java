class Solution 
{
    public String mostCommonWord(String p, String[] ban) 
    {
        p=p.toLowerCase();
        String[] words=p.split("[^a-zA-Z0-9]+");
        HashSet<String> set=new HashSet<>();
        for(String word:ban)
        {
            set.add(word);
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(String a:words)
        {
           if(!set.contains(a))
           {
              map.put(a,map.getOrDefault(a,0)+1);
           }
        }
        String ans="";
        int max=0;
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                ans=entry.getKey();
            }
        }
        return ans;
    }
}