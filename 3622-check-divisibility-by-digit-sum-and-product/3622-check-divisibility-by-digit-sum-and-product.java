class Solution 
{
    public boolean checkDivisibility(int n) 
    {
        int temp=n;
        int sum=0;
        int pro=1;
        while(n>0)
        {
            int d=n%10;
            sum=sum+d;
            pro=pro*d;
            n=n/10;
        }
        System.out.print(sum+" "+pro);
        int t=sum+pro;
        if(temp%t==0)
        return true;
        else
        return false;
    }
}