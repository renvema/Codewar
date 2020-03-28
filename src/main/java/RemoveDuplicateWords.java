import java.util.Arrays;
import java.util.LinkedHashSet;

import static java.util.stream.Collectors.joining;

public class RemoveDuplicateWords {

    public static String removeDuplicateWords(String s) {
        return new LinkedHashSet<String>(Arrays.asList(s.split(" ")))
                .toString()
                .replaceAll("(^\\[|\\]$)", "")
                .replace(", ", " ");
    }

    public static String removeDuplicate(String s) {
        return Arrays.stream(s.split(" "))
                .distinct()
                .collect(joining(" "));
    }

    public static void main(String[] args) {
        String str = "my cat is my cat fat";
          System.out.println(removeDuplicateWords(str));
        System.out.println(removeDuplicate(str));
    }
}
