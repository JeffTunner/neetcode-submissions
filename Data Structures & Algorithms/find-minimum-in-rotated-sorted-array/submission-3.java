class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while(l <= r) {
            int mid = l + (r - l)/2;

            if(mid < r && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }else if(mid > l && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if(nums[mid] < nums[l]) {
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return nums[0];
    }
}
