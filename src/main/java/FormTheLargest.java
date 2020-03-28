import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.Comparator.reverseOrder;

public class FormTheLargest {

    public static long maxNumber(long n) {
        String temp = Long.toString(n);
        int[] ints = new int[temp.length()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = temp.charAt(i) - '0';
        }
        long[] arr = Arrays.stream(ints)
                .mapToObj(value -> (long) value)
                .sorted(reverseOrder())
                .mapToLong(i -> i)
                .toArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
        }
        return Long.parseLong(stringBuilder.toString());
    }

//    public static long maxNumber(long n) {
//        return Long.parseLong(
//                Arrays.stream((n + "")
//                        .split(""))
//                        .sorted((x,y)->y.compareTo(x))
//                        .collect(Collectors.joining())
//        );
//    }
}
