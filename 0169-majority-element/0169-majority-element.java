class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int limit = n/2;
        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }
        for(Integer key: map.keySet()){
            if(map.get(key) > limit){
                majority =  key;
            }
        }
        return majority;
    }
}