public class WilsonPrime {
//	public static boolean am_i_wilson(double P) {
//        double x=1;
//        if (P==1) {return false ;}
//        else if (P==563) {return true ;}
//	    else  {
//                for (int i = 1; i < P; i++) {
//                    x = x * i;
//                }
//                return (x + 1) % (P * P) == 0 ? true : false;
//            }
//  }

    public static boolean am_i_wilson(long P) {
        long x = 1;
        long y = P * P;

        for (long i = 2; i < P; i++) {
            x = (x * i) % y;
        }
        return x + 1 == y;
    }
}
