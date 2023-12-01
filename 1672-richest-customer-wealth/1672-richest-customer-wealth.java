class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] customerbank : accounts) {
            int sum = 0;
            for(int bankMoney : customerbank) {
                sum += bankMoney;
            }
            if(sum >= maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}