class Solution 
{
    static void reverse(int l,int r,char[] ch)
    {
        while(l<r)
        {
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
    }
    public String reversePrefix(String s, int k) 
    {
        char[] ch=s.toCharArray();
        int l=0;
        int r=k-1;
        reverse(l,r,ch);
        return new String(ch);
    }
}