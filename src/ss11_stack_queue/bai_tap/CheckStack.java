package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class CheckStack {
    static boolean isBracket(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        String stack;
        System.out.printf("Nhập vào 1 biểu thức : ");
        Scanner scanner = new Scanner(System.in);
        stack = scanner.nextLine();
        if (CheckStack.isBracket(stack)) {
            System.out.println("Valid !!!");
        } else {
            System.out.println("Invalid !!!");
        }

    }
}
