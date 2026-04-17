class MinStack {
    List<Integer> list;
    int ptr = -1;

    public MinStack() {
        this.list = new ArrayList<>();
    }
    
    public void push(int val) {
        ptr++;
        list.add(val);
    }
    
    public void pop() {
        list.removeLast();
        ptr--;
    }
    
    public int top() {
        return list.get(ptr);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(Integer i: list) {
            min = Math.min(min, i);
        }
        return min;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
