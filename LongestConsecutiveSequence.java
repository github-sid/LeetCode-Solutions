class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length ==0)
        {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        int min = Integer.MAX_VALUE;
        for(int i:nums)
        {
            set.add(i);
        }

     
        int maxCount = 0;
        int count =0;
        for(int num: set)
        { 
            
            if(!set.contains(num-1))
            {
                int curr = num;
                count=0;
                while(set.contains(curr))
                {
                    count++;
                    curr++;
                }
                
            }
            maxCount = Math.max(maxCount,count);
        }

        return maxCount;
      
    }
}