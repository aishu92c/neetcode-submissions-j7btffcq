class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(nums.length == 0) return null;

        Map<Integer,Integer> frequencyTracker = new HashMap<>();

        for(int i=0;i< nums.length;i++) {
            frequencyTracker.put(nums[i],frequencyTracker.getOrDefault(nums[i],0) + 1);
            
        }
        List<int[]> array = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: frequencyTracker.entrySet()) {
            array.add(new int[] {entry.getValue(),entry.getKey()});
        }

        // sort the list.

        array.sort((a,b) -> b[0] - a[0] );

        int [] res = new int[k];

        for(int i =0; i<k ; i++) {
            res[i] = array.get(i)[1];
        }

        return res;
        
    }
}
