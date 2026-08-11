class Solution 
{
    public int percentageLetter(String s, char l) 
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==l)
            {
                c++;
            }
        }
        return (c*100)/s.length();
    }
}