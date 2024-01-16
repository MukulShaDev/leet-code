class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        String[] array = str.split(" ");
        String laststr = array[array.length-1];
        return laststr.length();
    }
}