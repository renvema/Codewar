public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String result = new String();

        String[] names = name.split(" ");

        for (String index : names) {
            result += index.charAt(0);
        }
        result = result.toUpperCase();
        return result.charAt(0) + "." + result.charAt(1);
    }
}
