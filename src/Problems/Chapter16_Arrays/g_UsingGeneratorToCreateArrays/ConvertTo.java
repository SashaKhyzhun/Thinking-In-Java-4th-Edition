package Problems.Chapter16_Arrays.g_UsingGeneratorToCreateArrays;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author SashaKhyzhun on 4/21/17. Page 621.
 *
 * Обобщения не работают с примитивами, а мы хотим использовать
 * генераторы для заполнения примитивных массивов. Для решения проблемы
 * мы создадим преобразователь, который получает произвольный массив
 * объектов-'оберток' и преобразует его в массив соответствующих
 * примитивных типов. Без этого нам пришлось бы создавать
 * специализированные генераторы для всех примитивов.
 *
 */
public class ConvertTo {

    public static boolean[] primitive(Boolean[] in) {
        boolean[] result = new boolean[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }

    public static char[] primitive(Character[] in) {
        char[] result = new char[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }

    public static byte[] primitive(Byte[] in) {
        byte[] result = new byte[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }

    public static short[] primitive(Short[] in) {
        short[] result = new short[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }

    public static int[] primitive(Integer[] in) {
        int[] result = new int[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }

    public static long[] primitive(Long[] in) {
        long[] result = new long[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }

    public static float[] primitive(Float[] in) {
        float[] result = new float[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }

    public static double[] primitive(Double[] in) {
        double[] result = new double[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }


}
