public class SquareSum {
    public static int squareSum(int[] n)
    {
        int z=0;
        for (int i=0; i<n.length; i++){
            int y=n[i]*n[i];
            z=z+y;
        }
        return z;
    }
}
