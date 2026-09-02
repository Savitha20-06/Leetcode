class Solution 
{
    public boolean isHappy(int n) 
    {
        int slow = n;
        int fast = n;

        while(true)
        {
            // slow moves one step
            int temp = slow;
            int sum = 0;

            while(temp > 0)
            {
                int d = temp % 10;
                sum = sum + d * d;
                temp = temp / 10;
            }

            slow = sum;


            // fast moves two steps
            temp = fast;
            sum = 0;

            while(temp > 0)
            {
                int d = temp % 10;
                sum = sum + d * d;
                temp = temp / 10;
            }

            fast = sum;

            temp = fast;
            sum = 0;

            while(temp > 0)
            {
                int d = temp % 10;
                sum = sum + d * d;
                temp = temp / 10;
            }

            fast = sum;


            if(slow == fast)
            {
                break;
            }
        }

        return slow == 1;
    }
}