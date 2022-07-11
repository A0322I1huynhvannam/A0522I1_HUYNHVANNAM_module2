package ss11_stack_queue.bai_tap;

import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        Stack<Integer> Stack = new Stack();

        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        Stack.push(5);
        int temp = Stack.size();
        Stack<Integer> wStack = new Stack<>();
        for (int i = 0 ; i<temp;i++){
            wStack.push(Stack.pop());
        }
        System.out.println(wStack);
    }
}
