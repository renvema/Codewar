public class MaxProduct {

    public int adjacentElementsProduct(int[] array) {
        int mult = 1;
        int max = array[0] * array[1];
        for (int i = 0; i < array.length - 1; i++) {
            mult = mult * array[i] * array[i + 1];
            if (mult > max) {
                max = mult;
            }
        }
        return max;
    }
}
