public class RepeatIt {

    public static String repeatString(final Object toRepeat, final int n) {
        if (toRepeat.getClass().equals(String.class)) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                stringBuilder.append(toRepeat);
            }
            return stringBuilder.toString();
        } else return "Not a string";
    }
}
