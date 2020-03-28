import java.util.*;
import java.util.stream.*;

public class Minimum {

    public static int minValue(int[] values) {
        String s = Arrays.stream(values)
                .sorted()
                .distinct()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(""));
        return Integer.valueOf(s);
    }
//    public static int minValue(int[] values) {
//        int [] arr = Arrays.stream(values)
//                .distinct()
//                .sorted()
//                .toArray();
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            stringBuilder.append(arr[i]);
//        }
//        return Integer.parseInt(stringBuilder.toString());
//    }

    public static void main(String[] args) {
        int[] values = {6, 7, 8, 7, 6, 6};
        String s = Arrays.stream(values)
                .sorted()
                .distinct()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(""));
        System.out.println(Integer.valueOf(s));
    }
}