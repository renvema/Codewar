import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {

        return Arrays.stream(args)
                .sorted()
                .findFirst().getAsInt();
    }
}