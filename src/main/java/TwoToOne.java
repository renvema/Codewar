import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoToOne {

    public static String longest(String s1, String s2) {
        String myString = s1 + s2;
        return Arrays.asList(myString.split(""))
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.joining());
    }
}
