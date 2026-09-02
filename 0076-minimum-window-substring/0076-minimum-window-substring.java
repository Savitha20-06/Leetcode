class Solution 
{
    public String minWindow(String s, String t) 
    {
        int[] need=new int[128];
        for(int i=0;i<t.length();i++)
        {
            need[t.charAt(i)]++;
        }
        int left = 0;
        int count = 0;
        int min=Integer.MAX_VALUE;
        int start=0;
        for(int right=0;right<s.length();right++)
        {
            char c=s.charAt(right);
            if(need[c]>0)
            {
                count++;
            }
            need[c]--;
            while(count==t.length())
            {
                int len=right-left+1;
                if(len<min)
                {
                    min=len;
                    start=left;
                }
                char ch=s.charAt(left);
                need[ch]++;
                if(need[ch]>0)
                {
                    count--;
                }
                left++;
            }
        }
        if(min==Integer.MAX_VALUE)
        {
            return "";
        }
        return s.substring(start,start + min);
    }
}