class Solution 
{
    public String makeSmallestPalindrome(String s) 
    {
        String res="";
        char[] ch=new char[s.length()];
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            if(s.charAt(l)<s.charAt(r))
            {
                ch[l]=s.charAt(l);
                ch[r]=s.charAt(l);
            }
            else
            {
                ch[l]=s.charAt(r);
                ch[r]=s.charAt(r);
            }
            l++;
            r--;
        }
        if(l==r)
        {
            ch[l]=s.charAt(l);
        }
        return new String(ch);
    }
}