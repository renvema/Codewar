public class Bob {

    public static int enough(int cap, int on, int wait) {
        if (wait <= (cap - on)) {
            return 0;
        }
        if (wait > (cap - on)) {
            return (wait + on - cap);
        }
        return cap;
    }
}
