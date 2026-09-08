class Solution 
{
    public boolean digitCount(String num) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        char[] ch=num.toCharArray();
        for(char c:ch)
        {
            int n=c-'0';
            map.put(n,map.getOrDefault(n,0)+1);
        }
        boolean b=true;
        for(int i=0;i<ch.length;i++)
        {
            int count=map.getOrDefault(i,0);
            if(ch[i]-'0'!=count)
            {
                b=false;
                break;
            }
        }
        return b;
    }
}