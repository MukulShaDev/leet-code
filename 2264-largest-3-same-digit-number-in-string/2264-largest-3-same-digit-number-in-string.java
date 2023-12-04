class Solution {
    public String largestGoodInteger(String num) {
        int max = 0;
        String finalstr = "";
        for(char ch : num.toCharArray()){
            String check = String.valueOf(ch);
            String combined = check+check+check;
            if(num.contains(combined)){
                int value = ch - '0';
                if(value >= max){
                    max = value;
                    finalstr = String.valueOf(ch);
                }
            }
        }
        return finalstr + finalstr + finalstr;
    }
}