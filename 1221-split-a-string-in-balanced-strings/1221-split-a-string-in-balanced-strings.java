class Solution 
{
    public int balancedStringSplit(String str) 
    {
        int cnt=0;
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(s.isEmpty())
            {
                s.push(str.charAt(i));
            }
            else if(s.peek()!=str.charAt(i))
            {
                s.pop();
                if(s.isEmpty())
                cnt++;
            }
            else
            {
                s.push(str.charAt(i));
            }
        }
        return cnt;
    }
}