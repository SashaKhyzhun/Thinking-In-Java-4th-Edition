package Problems.Chapter10_InnerСlasses.c_DotThisDotNew;

/**
 * Created by SashaKhyzhun on 1/16/17. Page 293
 * Использование конструкции .new для создания экземпляров внутренних классов.
 */
public class Parcel3 {
    class Contents {
        private int i = 11;
        public int value() { return i; }
    }
    class Destination {
        private String label;
        Destination(String whereTo) { label = whereTo; }
        String reedLable() { return label; }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        // Must use instance of outer class
        // to create an instance of the inner class:
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = p.new Destination("Крым наш");
    }
}
