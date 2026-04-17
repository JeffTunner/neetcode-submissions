class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0)+ 1);
        }
        int n = map.size();
        int[] unique = new int[n];
        int[] freq = new int[n];

        int index = 0;
        for (int key : map.keySet()) {
            unique[index] = key;
            freq[index] = map.get(key);
            index++;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (freq[i] < freq[j]) {

                    int temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;

                    int t = unique[i];
                    unique[i] = unique[j];
                    unique[j] = t;
                }
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = unique[i];
        }

        return ans;
    }
}
