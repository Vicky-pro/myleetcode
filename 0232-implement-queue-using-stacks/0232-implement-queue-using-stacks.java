class MyQueue {

    Stack<Integer> stk;
    Stack<Integer> stkReverse;
    public MyQueue() {
        stk = new Stack<>();
        stkReverse = new Stack<>();
    }
    
   
    public void push(int x) {
        stk.add(x);
    }
    
    public int pop() {
        if (!stkReverse.isEmpty()) {
            return stkReverse.pop();
        } else {
            while(!stk.isEmpty()) {
                stkReverse.add(stk.pop());
            }
            return stkReverse.pop();
        }
    }
    
    public int peek() {
         if (!stkReverse.isEmpty()) {
            return stkReverse.peek();
         } else {
            while(!stk.isEmpty()) {
                stkReverse.add(stk.pop());
            }
            return stkReverse.peek();
         }
    }
    
    public boolean empty() {
        return stkReverse.size() == 0 && stk.size() == 0;
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