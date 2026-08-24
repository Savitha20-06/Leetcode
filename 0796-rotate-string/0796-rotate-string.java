class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        int n=s.length();
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            char temp=arr[n-1];
            for(int j=n-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
            String res=new String(arr);
            if(res.equals(goal))
            return true;
        }
        return false;
    }
}