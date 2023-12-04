class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int firstValue = nums[i];
            int secondValue = target - firstValue;
            if(map.containsKey(secondValue)){
                return new int[] { map.get(secondValue), i };
            }
            map.put(firstValue, i);
        }
        return null;
    }
}