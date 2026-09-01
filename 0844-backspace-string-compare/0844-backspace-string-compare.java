class Solution 
{
    public boolean backspaceCompare(String s, String t) 
    {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        String t1="";
        String t2="";
        for(char c:c1)
        {
            if(c!='#')
            s1.push(c);
            else if(!s1.isEmpty())
            s1.pop();
        }
        for(char c:c2)
        {
            if(c!='#')
            s2.push(c);
            else if(!s2.isEmpty())
            s2.pop();
        }
        if(s1.equals(s2))
        return true;
        else
        return false;
    }
}