class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] ans = new int[m+n];
        List<Integer> list = new ArrayList<>();

        for(int t: nums1) {
            list.add(t);
        }


        for(int f: nums2) {
            list.add(f);
        }

        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        Arrays.sort(ans);

        if(ans.length % 2 == 0) {
            int mid = ans.length/2;
            return (double)(ans[mid - 1] + ans[mid])/2;
        } else {
            int mid = ans.length/2;
            return (double)ans[mid];
        }
    }
}
