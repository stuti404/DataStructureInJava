package MinStack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> st = new Stack<>();
    private int min;
    public void push(int item){
        if (st.isEmpty()){
            min =item;
            st.push(item);
        } else if (item>min) {
            st.push(item);
        }else {
            st.push(item-2*min);
            min = item;
        }
    }
    public int min(){
        return min;
    }
    public void Display(){
        System.out.println(st);
    }
    public int pop() throws Exception{
        if (st.isEmpty()){
            throw new Exception("Stack is empty");
        } else if (st.peek()>min) {
            return st.pop();
        }
        else {
            int popdata = st.pop();
            int rv = min;
            min = (rv-popdata)/2;
            return rv;
        }
    }
    public int peek() throws Exception{
        if (st.isEmpty()){
            throw new Exception("Stack is empty");
        } else if (st.peek()>min) {
            return st.pop();
        }
        else {
            int rv = min;
            return rv;
        }

    }


}
