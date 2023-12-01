class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for(int i = 1; i <= n; i++){
            String newstr = "";
           
            if(i % 3 == 0){
                newstr += "Fizz";
            }
            if(i % 5 == 0){
                newstr += "Buzz"; 
            }
            if(newstr.isEmpty()) {
                newstr += Integer.toString(i);
            }
            answer.add(newstr);
        }
        return answer;
    }
}