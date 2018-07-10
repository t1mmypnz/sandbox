import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by t1mmy on 05.02.2018.
 */


public class HellBoolean {

    public static boolean charExpression(int a) {

            return ((Integer.bitCount(Math.abs(a)))==1);

    }

    public static boolean isPalindrome(String text) {
        String text2 = new String(text);
        text2 = text2.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        StringBuffer text3 = new StringBuffer(text2);
        return text2.compareTo(String.valueOf(text3.reverse()))==0;
    }

    public static BigInteger factorial(int value) {
        BigInteger f = BigInteger.ONE;
        for (int i = 1; i<=value;++i){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        boolean a2True = false;
        boolean a1True = false;
        if (a2.length != 0) {
            a2True = true;
        }
        if (a1.length != 0)  = true;{
                a1True
        }
        if ((a1True && a2True)) {
            int[] a3 = new int[a1.length + a2.length];
            System.arraycopy(a2, 0, a3, 0, a2.length);
            System.arraycopy(a1, 0, a3, a2.length - 1, a1.length);
            int k;
            for (int j = 1; j < a3.length; ++j) {
                for (int i = 0; i < a3.length - 1; i++) {
                    if (a3[i] > a3[i + 1]) {
                        k = a3[i + 1];
                        a3[i + 1] = a3[i];
                        a3[i] = k;
                    }
                }
            }
            return a3;
        } else if (a1True) {
            int k;
            for (int j = 1; j < a1.length; ++j) {
                for (int i = 0; i < a1.length - 1; i++) {
                    if (a1[i] > a1[i + 1]) {
                        k = a1[i + 1];
                        a1[i + 1] = a1[i];
                        a1[i] = k;
                    }
                }
            }
            return a1;
        } else if (a2True){
            int k;
            for (int j = 1; j < a2.length; ++j) {
                for (int i = 0; i < a2.length - 1; i++) {
                    if (a2[i] > a2[i + 1]) {
                        k = a2[i + 1];
                        a2[i + 1] = a2[i];
                        a2[i] = k;
                    }
                }
            }
            return a2;
        }
        else {
            return null;
        }
    }



        public static void main(String [] args){
            int[] a5 = mergeArrays(new int[]{10, 2, 3}, new int[]{});
            for(int i = 0; i<a5.length;i++) {
                System.out.println(a5[i]);
            }
    }

}