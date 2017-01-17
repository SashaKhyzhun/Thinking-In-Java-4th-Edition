package Problems.Chapter10_InnerСlasses.f_AnonymousInnerСlasses;

/**
 * Created by SashaKhyzhun on 1/18/17. Page 298
 * Вызов конструктора базового класса.
 *
 * Следующий код показывает, как следует действовать,
 * если базовому классу нужен конструктор с аргументов:
 */

public class Parcel8 {

    public Wrapping getWrapping(int x) {
        // вызов конструктора базового класса:
        return new Wrapping(x) { // Передача аргумента конструктора
            @Override
            public int value() {
                return super.value() * 47;
            }
        }; // Точка с запятой необходима
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.getWrapping(10);
    }
} ///:~



class Wrapping {
    private int i;

    public Wrapping(int x) { i = x; }
    public int value() { return i; }

} ///:~
