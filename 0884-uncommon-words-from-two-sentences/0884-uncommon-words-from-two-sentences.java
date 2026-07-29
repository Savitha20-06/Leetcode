class Solution 
{
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        ArrayList<String> list=new ArrayList<>();
        String[] words1=s1.split(" ");
        String[] words2=s2.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:words1)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:words2)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                list.add(entry.getKey());
            }
        }
        String[] res=list.toArray(new String[0]);
        return res;
    }
}