class Solution {
    public boolean containsDuplicate(int[] nums) {

        //Time complexity - O(n)

        HashSet<Integer> set = new HashSet<>();
        for(int i :nums)
        {
            if(set.contains(i))
            {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    //Time Complexity - nlogn
        
    //     Arrays.sort(nums);
    //     for(int i=1;i<nums.length;i++)
    //     {
    //         if(nums[i] == nums[i-1])
    //         {
    //             return true;
    //         }
    //     }
    //    return false;

    
}


