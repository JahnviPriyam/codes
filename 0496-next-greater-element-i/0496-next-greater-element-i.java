class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m= nums2.length;
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            int k=-1;
            for(int j=0; j<m; j++)
            {
                if(nums2[j]==nums1[i])
                {
                    k=j;
                    break;
                }
            }
            int next= -1;
              for (int j = k + 1; j < m; j++) {
                if (nums2[j] > nums1[i]) {
                    next = nums2[j];
                    break;
                }
            }
            arr[i]=next;
        }
        return arr;
        
        
    }
}