class Solution {
    public boolean isPalindrome(String s) {
        String result = "";
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        for(char c : s.toCharArray()){
            result = c + result;
        }
        if(s.equals(result)){
            return true;
        }
        return false;
    }
}