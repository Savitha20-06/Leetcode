class Solution 
{
    public String frequencySort(String s) 
    {
        String res="";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        ArrayList<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue()-a.getValue());
        for(Map.Entry<Character,Integer> entry:list)
        {
            for(int i=0;i<entry.getValue();i++)
           res=res+entry.getKey();
        }
        return res;
    }
}