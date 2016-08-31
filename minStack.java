import java.util.Stack;

public class Solution {
	Stack<Integer> stack=new Stack<Integer>();
    Stack<Integer> minStack=new Stack<Integer>();
    public void push(int node) {
        stack.push(node);
        if(!minStack.isEmpty()&&node>minStack.peek()){
            minStack.push(minStack.peek());
            return;
         }
        minStack.push(node);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
}