public class HappyYear {
    static public int nextHappyYear(int year) {
        String string = Integer.toString(year);
        int[] ints = new int[string.length()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = string.charAt(i) - 48;
            while ((ints[0] == ints[3])) {

                //(ints[0] ^ ints[1]) && (ints[2] ^ ints[3]) || (ints[0] ^ ints[2]) && (ints[1] ^ ints[3])
                //(a ^ b) && (c ^ d) || (a ^ c) && (b ^ d)
                year++;
            }
            //  System.out.println(ints[i]);
        }
//        char [] chars = string.toCharArray();
//        for (int i = 0; i <chars.length ; i++) {
//            while (chars[0]!=chars[1]!=chars[2]!=chars[3]!)
//                year++;

        return year;
    }

    public static void main(String[] args) {

        System.out.println(nextHappyYear(1001));
    }
}