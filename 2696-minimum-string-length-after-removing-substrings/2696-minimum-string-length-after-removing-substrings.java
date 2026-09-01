class Solution 
{
    public int minLength(String str) 
    {
        int n=str.length();
        Stack<Character> s=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            s.push(str.charAt(i));
            if(s.size()>=2)
            {
                char c1=s.pop();
                char c2=s.pop();
                String temp=c1+""+c2;
                if(temp.equals("AB") || temp.equals("CD"))
                {
                    
                }
                else
                {
                    s.push(c2);
                    s.push(c1);
                }
            }
        }
        return s.size();
    }
}