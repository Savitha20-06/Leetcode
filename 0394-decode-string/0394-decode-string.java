class Solution 
{
    public String decodeString(String s) 
    {
        Stack<Integer> num=new Stack<>();
        Stack<String> str=new Stack<>();
        int n=0;
        String curr="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                n=n*10+(s.charAt(i)-'0');
            }
            else if(s.charAt(i)=='[')
            {
                num.push(n);
                str.push(curr);
                n=0;
                curr="";
            }
            else if(s.charAt(i)==']')
            {
                int count=num.pop();
                String prev=str.pop();
                String temp="";
                for(int k=0;k<count;k++)
                {
                    temp=temp+curr;
                }
                curr=prev+temp;
            }
            else
            {
                curr=curr+s.charAt(i);
            }
        }
        return curr;
    }
}