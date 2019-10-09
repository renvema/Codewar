import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {
    public static String removeDuplicateWords(String s){
        // Your code here, good sir.
        return Arrays.asList(s.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String str ="my cat is my cat fat";
        Arrays.asList(str).stream()
                .map(s -> s.split(" "))
                .distinct()
                .toArray();


str.replace("cat","dog");
        System.out.println(str.replace("cat","dog"));
        System.out.println(str.replaceAll("\\s","0"));
    }
}
