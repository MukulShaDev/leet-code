class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                int twosum = nums[i] + nums[j];
                if(twosum == target){
                    result[0] =  i;
                    result[1] =  j;
                }
            }
            
        }
        return result;
    }
}