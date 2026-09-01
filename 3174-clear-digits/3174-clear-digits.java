class Solution 
{
    public String clearDigits(String str) 
    {
        StringBuilder sb=new StringBuilder();
        Stack<Character> s=new Stack<>();
        for(char c:str.toCharArray())
        {
            if(Character.isLetter(c))
            {
                s.push(c);
            }
            else if(!s.isEmpty())
            {
                s.pop();
            }
        }
        while(!s.isEmpty())
        {
            sb.append(s.pop());
        }
        return sb.reverse().toString();
    }
}