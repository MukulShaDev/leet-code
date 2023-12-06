class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);map.put('V', 5);map.put('X', 10);
        map.put('L', 50);map.put('C', 100);map.put('D', 500);
        map.put('M', 1000);
        Map<String, Integer> pair = new HashMap<>();
        pair.put("IV", 4);pair.put("XL", 40);pair.put("CD", 400);
        pair.put("IX", 9);pair.put("XC", 90);pair.put("CM", 900);
        int result = 0;
        for(int index = 0; index <= s.length() - 1; index++){
            char first = s.charAt(index);
            if(index == s.length() - 1){ 
                result += map.get(first);
                break;
            }
            char second = s.charAt(index+1);
            String str = String.valueOf(first) + String.valueOf(second);
            if(pair.containsKey(str)){
                result += pair.get(str);
                index++;
            }
            else{
                result += map.get(first);
            }
        }
        return result;
    }
}