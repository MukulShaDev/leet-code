class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        if(arr.length == target.length){
            for(int i = 0; i<arr.length;i++){
                if(arr[i] == target[i]){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}