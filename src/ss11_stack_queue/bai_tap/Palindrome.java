package ss11_stack_queue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static boolean CheckPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
        }
        String s = "";
        String q = "";
        while (!stack.empty())
            s = s + stack.pop();
        while (!queue.isEmpty())
            q = q + queue.poll();
        return s.equalsIgnoreCase(q);
    }

    public static void main(String[] args) {
//        String string = "Able was I ere I saw Elba";
        System.out.println("hay nhap chuoi vao day :");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        if (CheckPalindrome(string))
            System.out.println( string + "' is a symmetric string.");
        else
            System.out.println(string + "' is not a symmetric string!");
    }
}

