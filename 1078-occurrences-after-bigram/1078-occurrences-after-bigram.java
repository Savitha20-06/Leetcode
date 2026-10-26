class Solution 
{
    public String[] findOcurrences(String s, String first, String second) 
    {
        String[] words=s.split(" ");
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<words.length-2;i++)
        {
            if(words[i].equals(first) && words[i+1].equals(second))
            {
                list.add(words[i+2]);
            }
        }
        String[] res=list.toArray(new String[0]);
        return res;
    }
}