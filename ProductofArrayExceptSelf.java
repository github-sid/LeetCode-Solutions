class Solution {
    public int[] productExceptSelf(int[] nums) {


        //answer[i] = product of left side x product of right

        int[] right = new int[nums.length];

        //product of right side
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i != nums.length -1)
            {
                right[i] = right[i+1] * nums[i+1];

            }else{
                right[i] = 1;
            }
        }

        int[] res = new int[nums.length];

        //Since we have product of the right
        //As soon as we get left side we can have the res array 

        int left=1;
        for(int i=0;i<nums.length;i++)
        {
            if(i != 0)
            {
                left = left*nums[i-1];
                res[i] = right[i] * left;
               
            
            }else{
                res[i] = right[i] * left;
            }
        }

       
        return res;
        
    }
}