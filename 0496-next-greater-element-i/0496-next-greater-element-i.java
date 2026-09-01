class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int n=nums1.length;
        int m=nums2.length;
        int[] res=new int[n];
        int[] check=new int[m];
        Stack<Integer> s=new Stack<>();
        for(int i=m-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<=nums2[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                check[i]=-1;
            }
            else 
            {
                check[i]=s.peek();
            }
            s.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    res[i]=check[j];
                    break;
                }
            }
        }
        return res;
    }
}