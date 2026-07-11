class Solution {
    public int subarraySum(int[] nums, int k) {
        //key : prefix[j], sum till index 0, j-1
        // value: count of sum seen
        Map<Integer, Integer> seen = new HashMap();
        seen.put(0,1);
        int runningSum = 0;
        int count = 0;
        for (int j=0; j < nums.length ; j++) {
             runningSum = runningSum + nums[j];
             int complement = runningSum - k;
             count = count + seen.getOrDefault(complement, 0);
             seen.merge(runningSum, 1, Integer::sum);
        }
        return count;
        
    }
}