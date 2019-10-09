import java.util.Arrays;
import java.util.Comparator;

public class SortOutTheMenFromBoys {
    public static int[] menFromBoys(final int[] values) {

        int[] even = Arrays.stream(values)
                .distinct()
                .filter(value -> value % 2 == 0)
                .sorted()
                .toArray();
        int[] odd = Arrays.stream(values)
                .distinct()
                .filter(value -> value % 2 != 0)
                .sorted()
                .toArray();
        int[] reverOdd = new int[odd.length];
        for (int i = reverOdd.length; i > 0; i--) {
            reverOdd[reverOdd.length - i] = odd[i - 1];
        }
        int[] c = new int[even.length + odd.length];
        System.arraycopy(even, 0, c, 0, even.length);
        System.arraycopy(reverOdd, 0, c, even.length, odd.length);
        return c;
    }
//    public static int[] menFromBoys(final int[] values) {
//        return Arrays.stream(values)
//                .distinct()
//                .boxed()
//                .sorted(Comparator.comparing(i -> i % 2 == 0 ? i : -i))
//                .sorted(Comparator.comparing(i -> Math.abs(i % 2)))
//                .mapToInt(i -> i)
//                .toArray();
//    }
}
