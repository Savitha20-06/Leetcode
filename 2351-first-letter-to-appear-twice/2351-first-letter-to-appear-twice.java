class Solution 
{
    public char repeatedCharacter(String s) 
    {
        char c='\0';
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
        {
           for(int j=i+1;j<s.length();j++)
           {
              if(s.charAt(j)==s.charAt(i))
              {
                if(j<min)
                {
                    min=j;
                    c=s.charAt(j);
                } 
                break;
              }
           }
        }
        return c;
    }
}