class Solution {

    public int peakSearching(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            } else if(arr[start] >= arr[mid]) {
                end = mid -1;
            } else if(arr[start] < arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    } 

    public int search(int[] nums, int target) {
        int peak = peakSearching(nums);
        int found  = binarySearch(nums, target, 0, peak);

        if(peak == -1) {
            return binarySearch(nums, target, 0, nums.length-1);
        }

        if (nums[peak] == target) {
            return peak;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, peak - 1);
        }

        return binarySearch(nums, target, peak + 1, nums.length - 1);
    }
}