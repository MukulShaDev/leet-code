class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String str : details) {
            char ele = str.charAt(11);
            char twe = str.charAt(12);
            int age = Integer.parseInt(""+ele+twe);
            if(age>60){
                count++;
            }
        }
    return count;
    }
}