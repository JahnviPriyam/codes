import java.util.*;

class Solution
{
    long minimizeSum(int N, int arr[])
    {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        for(int i = 0; i < N; i++)
            pq.add((long)arr[i]);
        
        long total = 0;
        
        while(pq.size() > 1)
        {
            long first = pq.poll();
            long second = pq.poll();
            
            long sum = first + second;
            total += sum;
            
            pq.add(sum);
        }
        
        return total;
    }
}
