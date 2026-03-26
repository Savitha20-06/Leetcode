class Solution 
{
    public int countStudents(int[] stu, int[] sandwich) 
    {
        Stack<Integer> st=new Stack<>();
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<stu.length;i++)
        {
            que.add(stu[i]);
        }
        for(int i=sandwich.length-1;i>=0;i--)
        {
            st.push(sandwich[i]);
        }
        int rej=0;
        while(!st.isEmpty() && !que.isEmpty())
        {
            if(st.peek().equals(que.peek()))
            {
                st.pop();
                que.remove();
                rej=0;
            }
            else
            {
                que.add(que.remove());
                rej=rej+1;
                if(rej==que.size())
                return que.size();
            }
        }
        return que.size();
    }
}