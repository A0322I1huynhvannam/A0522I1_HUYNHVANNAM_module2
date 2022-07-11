package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.TreeMap;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<Character, Integer> Char = new TreeMap<>();
        System.out.println("Nhap chuoi");
        String string = input.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (Char.get(string.charAt(i)) != null) {
                int count = Char.get(string.charAt(i));
                count++;
                Char.put(string.charAt(i), count);
            } else {
                Char.put(string.charAt(i), 1);
            }
        }
        System.out.println(Char);
    }
}
