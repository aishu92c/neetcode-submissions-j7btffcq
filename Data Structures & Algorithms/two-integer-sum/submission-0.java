class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> values = new HashMap<>();

        for( int i =0; i< nums.length ; i++) {
            
            Integer complement = target-nums[i];

            if(values.containsKey(complement)) {
                return new int[] {values.get(complement),i};
            } else {
                values.put(nums[i],i);
            }
        } 
        return null;
        
    }
}
