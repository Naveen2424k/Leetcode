class MyStack {
        int x;
        Deque<Integer> a=new ArrayDeque<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        this.x=x;
        a.addFirst(x);
    }
    
    public int pop() {
        return a.removeFirst();
    }
    
    public int top() {
        return a.peekFirst();
        
    }
    
    public boolean empty() {
        return a.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */