import java.util.stream.IntStream;

public class ReturnFirstMmultiplesN {
//    public static int[] multiples(int m, int n) {
//        int[] ints = new int[m];
//        for (int i = 0; i <m ; i++) {
//            ints[i]=(i+1)*n;
//        }
//        return ints;
//    }
    public static int[] multiples(int m, int n) {
      return IntStream.rangeClosed(1,m)
              .map(i -> n*i)
              .limit(m)
              .toArray();
    }
}
