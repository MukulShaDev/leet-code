class Solution {
    public int countKeyChanges(String s) {
        int count = 0;
        for(int i = 0; i < s.length()-1; i++){
            char current = s.charAt(i);
            char next = s.charAt(i+1);
            if(current != Character.toUpperCase(next) 
               && current != Character.toLowerCase(next)){
                count++;
            }
        }
        return count;
    }
}