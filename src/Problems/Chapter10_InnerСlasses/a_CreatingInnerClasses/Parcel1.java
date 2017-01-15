package Problems.Chapter10_InnerСlasses.a_CreatingInnerClasses;

/**
 * Created by SashaKhyzhun on 1/15/17. page #287
 * Создание внутрених классов.
 */
public class Parcel1 {
    class Contents {
        private int i = 11;
        public int value() { return i; }
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() { return label; }
    }

    // Использование внутренних классов очень похоже
    // на использование любых других классов,
    // в пределлах Parcel1:

    public void ship (String dest) {
        Contents c = new Contents();
        System.out.println(c.value());
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Танзания");
    }
}
