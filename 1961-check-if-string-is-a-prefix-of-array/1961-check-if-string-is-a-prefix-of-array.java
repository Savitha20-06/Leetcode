class Solution 
{
    public boolean isPrefixString(String s, String[] words) 
    {
        String res="";
        boolean b=false;
        for(int i=0;i<words.length;i++)
        {
            res=res+words[i];
            if(res.equals(s))
            {
                b=true;
                break;
            }
        }
        return b;
    }
}