class Solution 
{
    public String licenseKeyFormatting(String s, int k) 
    {
        int n=s.length();
        String temp="";
        String res="";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!='-')
            temp=temp+s.charAt(i);
        }
        System.out.print(temp);
        int c=0;
        for(int i=temp.length()-1;i>=0;i--)
        {
            c++;
            res=temp.charAt(i)+res;
            if(c==k && i!=0)
            { 
            c=0;
            res="-"+res;
            }
        }
        return res.toUpperCase();
    }
}