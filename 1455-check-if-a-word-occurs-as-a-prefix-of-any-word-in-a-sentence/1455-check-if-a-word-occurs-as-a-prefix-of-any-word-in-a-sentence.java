class Solution 
{
    public int isPrefixOfWord(String s, String word) 
    {
        String[] words=s.split(" ");
        int k=-1;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].startsWith(word))
            {
                k=i+1;
                break;
            }
        }
        return k;
    }
}