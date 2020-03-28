public class Solution {
    public static int add(int x, int y) {
        int s = x ^ y;
        int c = (x & y) << 1;
        return add(s, c);
    }

    public static void main(String[] args) {
        add(3, 5);
        add(12, 8);
    }
}
