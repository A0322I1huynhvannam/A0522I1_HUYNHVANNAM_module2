package ss19_string.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    public static final String REGEX_PHONE = "(84).*[0-9]{10}";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_PHONE);
        Matcher matcher = pattern.matcher("840978489648");
        System.out.println(matcher.matches());
    }
}
