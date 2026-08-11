class Solution 
{
    public String[] findRestaurant(String[] list1, String[] list2) 
    {
        ArrayList<String> l =new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++)
        {
            for(int j=0;j<list2.length;j++)
            {
                if(list1[i].equals(list2[j]))
                {
                    int sum=i+j;
                    if(sum<min)
                    {
                        min=sum;
                        l.clear();
                        l.add(list1[i]);
                    }
                    else if(sum==min)
                    l.add(list1[i]);
                }
            }
        }
        return l.toArray(new String[0]);
    }
}