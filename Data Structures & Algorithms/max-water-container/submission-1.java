class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxArea = 0;

        while(l < r) {
            int h = Math.min(heights[l], heights[r]);
            int b = r - l;
            int area = h * b;

            maxArea = Math.max(area, maxArea);
            if(heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
