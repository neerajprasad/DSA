package leetCode.stack;

import java.util.ArrayList;
public class MyStack{
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.push(2147483647);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.push(-2147483648);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());



    }
}

class MinStack {
    private ArrayList<Integer> stack ;
    private int minValue ;

    public MinStack() {
        stack = new ArrayList<>();
        minValue = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (minValue > x) {
            minValue = x;
        }
        stack.add(x);
    }

    public void pop() {
        int removeValue=stack.remove(stack.size()-1);
        if(removeValue==minValue){
            setMinValue();
        }
    }

    private void setMinValue() {
        minValue = stack.stream().mapToInt(v ->v).min().orElse(Integer.MAX_VALUE);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return minValue;
    }
}