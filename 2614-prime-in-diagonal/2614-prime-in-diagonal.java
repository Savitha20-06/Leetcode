// class Solution 
// {
//     public int diagonalPrime(int[][] nums) 
//     {
//         int n=nums[0].length;
//         int max=0;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(i==j || i+j==n-1)
//                 {
//                     int num=nums[i][j];
//                     int c=0;
//                     for(int k=2;k<num;k++)
//                     {
//                         if(num%k==0)
//                         { 
//                         c++;
//                         break;
//                         }
//                     }
//                     if(c==0)
//                     max=Math.max(num,max);
//                 }
//             }
//         }
//         return max;
//     }
// }
class Solution 
{
    public int diagonalPrime(int[][] nums) 
    {
        int n = nums.length;
        int max = 0;

        for(int i = 0; i < n; i++)
        {
            int num = nums[i][i];

            if(num >= 2)
            {
                int c = 0;
                for(int k = 2; k * k <= num; k++)
                {
                    if(num % k == 0)
                    {
                        c++;
                        break;
                    }
                }
                if(c == 0)
                    max = Math.max(num, max);
            }

            if(i != n - 1 - i)   // avoid checking center twice
            {
                num = nums[i][n - 1 - i];

                if(num >= 2)
                {
                    int c = 0;
                    for(int k = 2; k * k <= num; k++)
                    {
                        if(num % k == 0)
                        {
                            c++;
                            break;
                        }
                    }
                    if(c == 0)
                        max = Math.max(num, max);
                }
            }
        }
        return max;
    }
}