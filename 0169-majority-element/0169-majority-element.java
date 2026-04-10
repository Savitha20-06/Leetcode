class Solution {
    public int majorityElement(int[] nums) {
        int count=0;              
        Integer c=null;   

        for (int num:nums) {
            if (count==0) {
                c=num;   
            }
            count+=(num == c) ? 1 : -1;
        }
        return c; 
    }
}
