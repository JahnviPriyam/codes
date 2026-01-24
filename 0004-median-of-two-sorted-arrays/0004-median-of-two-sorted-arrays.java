class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m= nums2.length;
        double[] arr= new double[n+m];
        for(int i=0; i<n; i++)
        {
            arr[i]= nums1[i];
        }
        for(int i=0; i<m; i++)
        {
            arr[n+i]= nums2[i];
        }
        Arrays.sort(arr);
        int len= n+m;
        if (len % 2 == 0) {
            return (arr[len/2 - 1] + arr[len/2]) / 2.0;
        } else {
            return arr[len/2];
        }
        
    }
}