class MinStack {
    
    private Stack<Integer> st;
    private Stack<Integer> minSt;
    private int min;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
        min = Integer.MAX_VALUE;
        minSt.push(min);
    }
    
    public void push(int val) {
        st.push(val);
        min = Math.min(min,val);
        minSt.push(min);
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
        min = minSt.peek();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */