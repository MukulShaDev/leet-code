class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int remainder = 0;
        int temp = x;
        while(x > 0){
            remainder = x % 10;
            sum = sum*10 + remainder;
            x = x / 10;
        }
        if(temp == sum){
            return true;
        }
        else {
            return false;
        }
    }
}