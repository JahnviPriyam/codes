class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        int size= q.size();
        int[] arr= new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]= q.poll();
        }
        for(int i= size-1; i>=0; i--)
        {
            q.offer(arr[i]);
        }
    }
}