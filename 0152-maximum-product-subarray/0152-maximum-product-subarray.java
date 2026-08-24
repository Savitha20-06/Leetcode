class Solution 
{
    public int maxProduct(int[] arr) 
    {
        int currmax=arr[0];
        int currmin=arr[0];
        int maxpro=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int temp=currmax;
            currmax=Math.max(arr[i],Math.max(arr[i]*currmax,arr[i]*currmin));
            currmin=Math.min(arr[i],Math.min(arr[i]*temp,arr[i]*currmin));
            maxpro=Math.max(maxpro,currmax);
        }
        return maxpro;
    }
}