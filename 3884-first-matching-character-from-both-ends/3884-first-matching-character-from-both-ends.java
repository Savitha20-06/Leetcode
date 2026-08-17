class Solution 
{
    public int firstMatchingIndex(String s) 
    {
        int min=-1;
        int l=0;
        int r=s.length()-1;
        while(l<=r)
        {
            if(s.charAt(l)==s.charAt(r))
            {
                min=Math.min(l,r);
                break;
            }
            l++;
            r--;
        }
        return min;
    }
}