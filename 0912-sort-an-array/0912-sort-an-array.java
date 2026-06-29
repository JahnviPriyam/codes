import java.util.*;
class Solution {
    void mergeSort(int[] nums, int start, int end)
    {
        if(start<end)
        {
            int mid= start+(end-start)/2;
            mergeSort(nums,start,mid);
            mergeSort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
    }
    void merge(int[] arr, int start,int mid, int end)
    {
        List<Integer> temp= new ArrayList<>();
        int i= start;
        int j= mid+1;
        while(i<=mid&&j<=end){
            if(arr[i]<arr[j])
            {
                temp.add(arr[i]);
                i++;
            }
            else
            {
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=mid)
        {
            temp.add(arr[i]);
            i++;
        }
        while(j<=end)
        {
            temp.add(arr[j]);
            j++;
        }
        for(int in=0; in<temp.size();in++)
        {
            arr[in+start]=temp.get(in);
        }
    }
    public int[] sortArray(int[] nums) {
        int n= nums.length;
        int start= 0;
        int end= n-1;
        mergeSort(nums,start,end);
        return nums;

    }
}
