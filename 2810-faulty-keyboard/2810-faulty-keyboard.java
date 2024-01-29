class Solution {
    public String finalString(String s) {
        String result = "";
        for(char c : s.toCharArray()){
            if(c == 'i'){
                int len = result.length();
                String reverse = "";
                for(int i = len-1; i >= 0; i--){
                   reverse += result.charAt(i);
                }
                result = reverse;
            } else{
                result += c; 
            }
        }
        return result;
    }
}