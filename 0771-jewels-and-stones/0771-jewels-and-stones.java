class Solution 
{
    public int numJewelsInStones(String j, String s) 
    {
        int cnt=0;
        for(char ch:j.toCharArray())
        {
            for(char c:s.toCharArray())
            {
                if(ch==c)
                cnt++;
            }
        }
        return cnt;
    }
}