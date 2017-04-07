package Problems.Chapter08_Polymorphism.BehaviorOfMethodsInsideConstuctors;

/**
 * Created by SashaKhyzhun on 1/5/17.
 */

/**
 * Behavior of Polymorph Methods when we make call they from constructor
 */

// страница 257
// Кострукторы и полиморфзм дают не тот результат, который можно было бы ожидать.


class Glyph {
    void draw() {
        // между базовым и производным классом - выбрался производный.
        System.out.println("Glyph.draw()"); // ???
    }
    Glyph() {
        System.out.println("Glyph() перед вызовом draw()"); //1
        draw(); // это вызвалось с child класса.
        System.out.println("Glyph() после вызова  draw()"); // 3
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius); //4
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius); //2
    }
}


public class PolyConstructors {

    public static void main(String[] args) {
        new RoundGlyph(5);
    }

}
