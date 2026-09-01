class Solution 
{
    public String makeGood(String str) 
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            s.push(str.charAt(i));
            if(s.size()>=2)
            {
                char c1=s.pop();
                char c2=s.pop();
                if(Character.toLowerCase(c1)==Character.toLowerCase(c2) && Character.isUpperCase(c1)!=Character.isUpperCase(c2))
                {

                }
                else
                {
                    s.push(c2);
                    s.push(c1);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty())
        {
            sb.append(s.pop());
        }
        return sb.reverse().toString();
    }
}