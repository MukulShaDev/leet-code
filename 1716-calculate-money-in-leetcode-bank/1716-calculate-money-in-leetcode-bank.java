class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int temp = 1;
        for(int i = 1; i <= n; i++, temp++){
            sum = sum + temp;
            if(i % 7 == 0) {
                int quo = i / 7;
                temp = quo;
            }
        }
        return sum;
    }
}