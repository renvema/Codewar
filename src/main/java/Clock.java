public class Clock {

    public static int Past(int h, int m, int s) {
        int mm = 1000 * s + 60 * 1000 * m + 24 * 60 * 1000 * h;
        return mm;
    }
}
