package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void Convert(int numberBinari){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter the number which you want to convert:");
        int number = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            int temp = number % numberBinari;
            stack.push(temp);
            number /= numberBinari;
        }
        System.out.print("The String after converting is: ");
        while (!stack.isEmpty()) {
            if (stack.peek() < 10)
                System.out.print(stack.pop() + " ");
            else
                System.out.print((char) (stack.pop() + 55) + " ");
        }
    }

    public static void main(String[] args) {
        Convert(2);
    }
    }

