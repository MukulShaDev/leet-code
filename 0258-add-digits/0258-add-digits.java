class Solution {
    public int addDigits(int num) {
        int sum = 0;
        int countdigit =  0;
        while(num > 0 || sum > 9){
            if(num == 0){
                num = sum;
                sum = 0;
            }
            int last = num%10;
            sum += last;
            num /= 10;
            countdigit++;
        }
        return sum;
    }
}