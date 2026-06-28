class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap();
        boolean duplicate = false;
        for (int i=0; i < nums.length; i++) {
            if(numMap.containsKey(nums[i])){
                numMap.put(nums[i], numMap.get(nums[i])+1);    
            } else {
                numMap.put(nums[i], 1);
            }
        }
        Collection<Integer> values = numMap.values();
        for (Integer value : values) {
            if(value > 1) {
                duplicate = true;
            } 
        }
        return duplicate;
    }
}