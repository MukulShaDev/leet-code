class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList();
        for(int i = 0; i < words.length; i++) {
            String str = words[i];
            if(str.indexOf(x) == -1){
                continue;
            }
            else{
                result.add(i);
            }
        }
        return result;
    }
}