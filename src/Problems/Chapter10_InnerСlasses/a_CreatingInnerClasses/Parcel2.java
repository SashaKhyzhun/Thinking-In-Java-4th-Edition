package Problems.Chapter10_InnerСlasses.a_CreatingInnerClasses;

/**
 * Created by SashaKhyzhun on 1/15/17. Page #289
 * Возврат ссылки на внутренний класс.
 */
public class Parcel2 {

    class Contents {
        private int i = 11;
        private int value() { return i; }
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() { return label; }
    }
    public Destination to(String s) {
        return new Destination(s);
    }
    public Contents contents() {
        return new Contents();
    }
    public void ship(String destination) {
        Contents c = new Contents();
        Destination d = new Destination(destination);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Хохляндия");
        Parcel2 q = new Parcel2();
        // Определение ссылок на внутренние классы:
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Гоа");
    }
}
