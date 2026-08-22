class Solution 
{
    public String[] findWords(String[] words) 
    {
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String t=words[i];
            String temp=words[i].toLowerCase();
            boolean r1=true;
            boolean r2=true;
            boolean r3=true;
            for(int j=0;j<temp.length();j++)
            {
                char c=temp.charAt(j);
                if(!s1.contains(String.valueOf(c)))
                r1=false;
                if(!s2.contains(String.valueOf(c)))
                r2=false;
                if(!s3.contains(String.valueOf(c)))
                r3=false;    
            }
            if(r1 || r2 || r3)
            list.add(t);
        }
        return list.toArray(new String[0]);
    }
}