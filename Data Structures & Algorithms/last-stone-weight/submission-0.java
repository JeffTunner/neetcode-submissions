class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for(int n: stones) {
            maxHeap.add(n);
        }

        while(maxHeap.size() > 1) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            int r = x - y;
            if(r != 0) {
                maxHeap.add(r);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
