class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        else{
        char[] arr1 = s1.toCharArray();
            char temp = arr1[0];
            arr1[0] = arr1[2];
            arr1[2] = temp;
        String str1 = String.valueOf(arr1);
        if(str1.equals(s2)){
            return true;
        }
        else{
            char[] arr2 = s1.toCharArray();
            char temp1 = arr2[1];
            arr2[1] = arr2[3];
            arr2[3] = temp1;
            String str2 = String.valueOf(arr2);
            if(str2.equals(s2)){
                return true;
            }
            else{
                char temp2 = arr1[1];
            arr1[1] = arr1[3];
            arr1[3] = temp2;
        String str3 = String.valueOf(arr1);
        if(str3.equals(s2)){
                return true;
            }
            else{
                return false;
            }
            }
            
        }
        
        
            
       }
        
    }
}