import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberPrimorial {
    public static String numPrimorial(int n) {
        int res = 2;
        for (int i = 3; i <2 * n+1; i += 2) {
            res = i*res;
        }
        return String.valueOf(res); // Do your magic!
    }

    public static void main(String[] args) {
        int n =3;
//        System.out.println(numPrimorial(3));
//        System.out.println(numPrimorial(4));
//        System.out.println(numPrimorial(5));
        IntStream
                .rangeClosed(2, n)
                .filter(value -> value%2!=0)
                .filter(value -> value%3!=0)
                .reduce(1, (x, y) -> x * y);
       System.out.println(IntStream
               .rangeClosed(2, n)
               .filter(value -> value%2!=0)
               .filter(value -> value%3!=0)
               .reduce(1, (x, y) -> 2*3*x * y));
//        Arrays.stream((n+"").split(""))
//                .sorted(Comparator.comparing(i -> i % 2 == 0 ? i : -i))
    }
}
