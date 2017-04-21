package Problems.Chapter16_Arrays.f_CreatingTestData;

import Problems.Chapter15_Generics.d_GenericInteface.Generator;

/**
 * @author SashaKhyzhun on 4/21/17. Page 616.
 * Простые реализации генераторов.
 */
public class CountingGenerator {

    public static class Boolean implements Generator<java.lang.Boolean> {
        private boolean value = false;
        @Override public java.lang.Boolean next() {
            value = !value; // простое переключение
            return value;
        }
    }

    public static class Byte implements Generator<java.lang.Byte> {
        private byte value = 0;
        @Override public java.lang.Byte next() { return value++; }
    }

    public static char[] chars = ("qwertyuiop" + "QWERTYUIOP").toCharArray();
    public static class Character implements Generator<java.lang.Character> {
        int index = -1;

        @Override public java.lang.Character next() {
            index = (index + 1) % chars.length;
            return chars[index];
        }
    }

    public static class String implements Generator<java.lang.String> {
        private int length = 7;
        Generator<java.lang.Character> cg = new Character();
        public String() {}
        public String(int i) { this.length = length; }
        @Override public java.lang.String next() {
            char[] buf = new char[length];
            for (int i = 0; i < length; i++)
                buf[i] = cg.next();
            return new java.lang.String(buf);
        }
    }

    public static class Integer implements Generator<java.lang.Integer> {
        private int value = 0;
        @Override public java.lang.Integer next() { return value++; }
    }

}
