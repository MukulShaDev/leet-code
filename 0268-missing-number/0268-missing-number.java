class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long totalSum = n*(n+1)/2;
        long sum = 0;
        for(int ele: nums){
            sum += ele;
        }
        return (int) (totalSum-sum);
    }
}