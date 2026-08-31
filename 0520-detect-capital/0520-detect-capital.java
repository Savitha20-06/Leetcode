class Solution 
{
    public boolean detectCapitalUse(String word) 
    {
        boolean b=true;
        for(int i=0;i<word.length();i++)
        {
            if(word.equals(word.toUpperCase()))
            return true;
            if(word.equals(word.toLowerCase()))
            return true;
            if(Character.isUpperCase(word.charAt(0)))
            {
                for(int j=1;j<word.length();j++)
                {
                    if(!Character.isLowerCase(word.charAt(j)))
                    {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}