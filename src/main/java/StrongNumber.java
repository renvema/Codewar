import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

class StrongNumber {

    public static String isStrongNumber(int num) {
        String str = Long.toString(num);

        int fact = Arrays.asList(str.split(""))
                .stream()
                .mapToInt(Integer::parseInt)
                .map(StrongNumber::factorial)
                .sum();

        return fact == num ? "STRONG!!!!" : "Not Strong !!";
    }

    public static Integer factorial(int number) {
        if (number < 2) return Integer.valueOf(1);
        return IntStream
                .rangeClosed(2, number)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger::multiply).get()
                .intValue();
    }
}
