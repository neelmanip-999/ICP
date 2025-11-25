class MyQueue {
    // Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        // st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        // st1.push(x);
        if(st2.size()==0) st2.push(x);
        else addLast(x);
    }
    
    public int pop() {
        return st2.pop();
    }
    
    public int peek() {
        return st2.peek();
    }
    
    public boolean empty() {
        return st2.size() == 0;
    }

    public void addLast(int item){
        if(st2.size() == 0){
            st2.push(item);
            return;
        }
        int ele = st2.pop();
        addLast(item);
        st2.push(ele);
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */