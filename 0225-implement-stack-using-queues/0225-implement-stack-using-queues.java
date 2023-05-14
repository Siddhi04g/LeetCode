class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int size = 0;
    
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
        size++;
    }
    
    public int pop() {
        //Queue<Integer> q3 = new LinkedList<>(q1);
        q2.clear();
        while(q1.size() > 1){
            q2.offer(q1.poll());
        }
        int x = q1.poll();
        System.out.print(q2);
        size--;
        Queue<Integer> q3 = q1;
        q1 = q2;
        q2 = q3;
        return x;
    }
    
    public int top() {
         q2.clear();
        while(q1.size() > 1){
            q2.offer(q1.poll());
        }
        int x = q1.peek();
        q2.add(x);
        Queue<Integer> q3 = q1;
        q1 = q2;
        q2 = q3;
        return x;
    }
    
    public boolean empty() {
        if(size == 0) return true;
        return false;
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