class Solution 
{
    public boolean isPossibleToSplit(int[] nums) 
    {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i : nums)
        {
            if(!set1.contains(i))
            {
                set1.add(i);
            }
            else if(!set2.contains(i))
            {
                set2.add(i);
            }
            else
            {
                return false;
            }
        }

        return true;
    }
}