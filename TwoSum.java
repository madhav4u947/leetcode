class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        Map<Integer,Integer> numMap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            numMap.put(nums[i],i);            
        }
        
        for(int i=0;i<nums.length;i++)
        {
            Integer oi = numMap.get(target-nums[i]);
            if(oi!=null && oi!=i)
            {
                result[0] = i;
                result[1] = oi;
                break;
            }            
        }
        return result;
    }
}
