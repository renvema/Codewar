import java.util.Arrays;

public class BalancedNumber {

    public static String balancedNum(long number) {
        String str = Long.toString(number);
        String begin;
        String end;
        if (str.length() == 1 | str.length() == 2) {
            return "Balanced";
        } else if (str.length() % 2 == 0) {
            begin = str.substring(0, str.length() / 2 - 1);
            end = str.substring(str.length() / 2 + 1, str.length());
        } else {
            begin = str.substring(0, (str.length() - 1) / 2);
            end = str.substring((str.length() + 1) / 2, str.length());
        }

        return sumNumber(begin).equals(sumNumber(end)) ? "Balanced" : "Not Balanced";
    }

    public static Integer sumNumber (String string){
        return Arrays.asList(string.split(""))
                .stream()
                .mapToInt(Integer::parseInt)
                .sum();
    }

    public static void main(String[] args) {
        long n = 1230987;
        long m = 7;
        long l = 959;
        long k = 56239814;
        Arrays.stream((k + "")
                .split(""))
                //.map(s -> s.length() % 2 == 0 ? s.substring(0, s.length() / 2 - 1) : s.substring(0, (s.length() - 1) / 2))
                .forEach(System.out::println);
        System.out.println(balancedNum(n));
        System.out.println(balancedNum(m));
        System.out.println(balancedNum(l));
        System.out.println(balancedNum(k));


    }
}
