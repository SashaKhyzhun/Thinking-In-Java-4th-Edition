package Problems.Chapter10_InnerСlasses.h_NestedClasses;

// Вложенные (статические внутренние) классы.

import Problems.Chapter10_InnerСlasses.d_InnerClassesAndUpcast.Contents;
import Problems.Chapter10_InnerСlasses.d_InnerClassesAndUpcast.Destination;

/**
 * Created by SashaKhyzhun on 1/20/17. Page 304
 * Есть и еще одно отличие между вложенными и обычными внутренними классами.
 * Поля и методы обычного внутреннего класса определяются только на уровен
 * внешнего класса, поэтому обычные внутренние классы не могут объявлять свои
 * данные, поля и классы как static. Но вложенные клаасы не имеют таких ограничений:
 */
public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    protected static class ParcelDestination implements Destination {
        private String label;
        private ParcelDestination(String whereTo) {label = whereTo;}
        public String readLabel() {
            return label;
        }
        // Вложенные классы могу содержать другие статические элементы:
        public static void f() {}
        static class AnotherLevel {
            public static void f() {}
            static int x = 10;
        }
    }
    public static Destination getDestination(String s) {
        return new ParcelDestination(s);
    }
    public static Contents getContents() { return new ParcelContents(); }

    public static void main(String[] args) {
        Contents c = getContents();
        Destination d = getDestination("Canada");
    }
}
