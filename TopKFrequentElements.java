class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //Using Bucket

        // Array index = freq, since max freq of an element is nums.length

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        List<Integer>[] list = new List[nums.length+1];

        for(int num : map.keySet())
        {
            int freq = map.get(num);

            if(list[freq] == null)
            {
                list[freq] = new ArrayList<>();
            }

            list[freq].add(num);
        }

        int[] res = new int[k];
        int indx =0;

        //Parse thru the arraylist 
        for(int i=list.length-1; i>=0 && indx<k ; i--)
        {
            if(list[i] != null)
            {
                for(int j:list[i])
                {
                    res[indx] = j;

                    indx++;
                

                }
            }

        }



    return res;




        //Using Min Heap - Since top k elements

        //HashMap to store elememts and their freq

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i=0;i<nums.length;i++)
        // {

        //     if(map.containsKey(nums[i]))
        //     {
        //         //Add to freq
        //         map.put(nums[i], map.get(nums[i])+1);
        //     }
        //     else{
        //         map.put(nums[i], 1);
        //     }
        // }

        // //Use Priority Queue for min heap

        // PriorityQueue<Integer> pq = new  PriorityQueue<>(
        //     (a,b) -> map.get(a) - map.get(b)
        // );


        // //Add to pq
        // for(int num: map.keySet())
        // {
        //     System.out.println(num);
        //     pq.add(num);

        //     if(pq.size()>k)
        //     {
        //         pq.poll();
               
        //     }
        // }

        // //Create the result 

        // int[] res = new int[k];

        // for(int i=k-1;i>=0;i--)
        // {
        //     // if(pq.size()>0)
        //     res[i] = pq.poll();
        // }


        // return res;
    }
}