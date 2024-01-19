class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String result = "";
        for(String str:words){
            result += str.charAt(0);
        }
        return result.equals(s);
    }
}