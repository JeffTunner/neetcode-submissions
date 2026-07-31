class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            for (int j = 0; j < nums.length; j++) {
                if(i != j) {
                    prod*= nums[j];
                }
            }
            output[i] = prod;
        }
        return output;
    }
}  
