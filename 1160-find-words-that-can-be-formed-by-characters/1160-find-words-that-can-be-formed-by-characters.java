class Solution 
{
    public int countCharacters(String[] words, String chars) 
    {
        int[] freq=new int[126];
        for(int i=0;i<chars.length();i++)
        {
            freq[chars.charAt(i)]++;
        }
        int sum=0;
        for(int i=0;i<words.length;i++)
        {
            int[] temp=freq.clone();
            String sub=words[i];
            boolean b=true;
            for(int j=0;j<sub.length();j++)
            {
                temp[sub.charAt(j)]--;
                if(temp[sub.charAt(j)]<0)
                {
                    b=false;
                    break;
                }
            }
            if(b)
            sum=sum+sub.length();
        }
        return sum;
    }
}