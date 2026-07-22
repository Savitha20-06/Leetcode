class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        int n=s1.length();
        char[] c1=s1.toCharArray();
        Arrays.sort(c1);
        String temp1=new String(c1);
        for(int i=0;i<=s2.length()-n;i++)
        {
            String sub=s2.substring(i,i+n);
            char[] c2=sub.toCharArray();
            Arrays.sort(c2);
            String temp2=new String(c2);
            if(temp1.equals(temp2))
            {
                return true;
            }
        }
        return false;
    }
}