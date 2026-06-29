class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        double re=0;
        int le=nums1.length+nums2.length;
        int[] res=new int[le];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int len=list.size()/2;
        if(list.size()%2!=0)
        {
            re=re+list.get(len);
        }
        if(list.size()%2==0)
        {
            int sum=list.get(len)+list.get(len-1);
            re=re+(double)sum/2;
        }
        return re;
    }
}