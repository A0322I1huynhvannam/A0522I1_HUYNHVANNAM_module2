package ss19_string.bai_tap;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
   public static final String REGEX_NAME = "^[A|C|P]\\\\d{4}[G|H|I|K|L|M]$";

    public static void main(String[] args) {
        System.out.println("C0318G".matches(REGEX_NAME));
    }
}
