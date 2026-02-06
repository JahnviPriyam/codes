class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, true);
        }

       // int longest = 0;

        for (int x : nums) {
            if (map.containsKey(x)){
                if(map.containsKey(x-1)==true)
                map.put(x,false);
            }
        }
        int len=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==true){
              int   val= nums[i];  int curr=1;
              while(map.containsKey(val+1)){ curr++;
                val++;
              }
              len=Math.max(len,curr);
            }
        }
        return len;

        /*


            int left = x - 1;
            int right = x + 1;
            int count = 1;

            map.put(x, true);

            while (map.containsKey(left) && !map.get(left)) {
                map.put(left, true);
                count++;
                left--;
            }

            while (map.containsKey(right) && !map.get(right)) {
                map.put(right, true);
                count++;
                right++;
            }

            longest = Math.max(longest, count);
        }

        return longest;*/
    }
}
