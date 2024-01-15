class Solution {
    public int singleNumber(int[] nums) {
        
        for(int digit: nums){
            int count=0;
            for(int i=0; i < nums.length; i++){
                if(digit == nums[i]){
                    count++;
                    if(count > 1){
                       break;
                    }
                }
            }
            if(count == 1){
                return digit;
            }
        }
        return 0;
    }
}