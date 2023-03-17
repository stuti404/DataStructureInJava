package MinStack;

import java.util.Stack;

public class MinClient {
    public static void main(String[] args) throws Exception {
        MinStack s = new MinStack();
        s.push(5);
        s.push(7);
        s.push(2);
        s.push(9);
        s.push(4);
        s.push(3);
        s.push(1);
        s.Display();
        System.out.println(s.min());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.Display();
        System.out.println(s.min());
        s.Display();
        System.out.println(s.peek());

    }
}
