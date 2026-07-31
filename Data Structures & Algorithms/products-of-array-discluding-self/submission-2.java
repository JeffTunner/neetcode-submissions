class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prod = 1, count = 0;
        for(int n: nums) {
            if(n != 0) {
                prod *= n;  
            } else {
                count++;
            }
        }
        if(count > 1) {
            return new int[nums.length];
        }

        for(int i = 0; i < nums.length; i++) {
            if(count > 0) {
                res[i] = (nums[i] == 0) ? prod : 0;
            } else {
                res[i] = prod / nums[i];
            }
             
        }
        return res;
    }
}  
