package Problems.Chapter10_InnerСlasses.d_InnerClassesAndUpcast;

/**
 * Created by SashaKhyzhun on 1/17/17. Page 294
 * Внутренние классы и восходящее преобразование
 *
 * При получении из метода ссылки на базовый класс или интерфейс возможны ситуации,
 * в которых вам даже не удастся определить ее точный тип, как здесь:
 */

class Parcel4 {
    private class PrivateContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }
    protected class ProtectedDestination implements Destination {

        private String label;

        private ProtectedDestination(String whereTo) {
            label = whereTo;
        }
        @Override
        public String readLabel() {
            return label;
        }
    }
    public Destination destination(String s) {
        return new ProtectedDestination(s);
    }
    public Contents contents() {
        return new PrivateContents();
    }
}

public class TestParcel {

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Canada");
        // Обращение к закрытому классу невозможно:
        // Parcel4.PContents pc = p.new PContents();
    }

}
