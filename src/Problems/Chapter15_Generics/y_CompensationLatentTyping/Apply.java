package Problems.Chapter15_Generics.y_CompensationLatentTyping;

import Problems.Chapter14_InfoAboutTypes.a_RTTI.Shapes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SashaKhyzhun on 4/7/17. Page 588.
 *
 * Применение метода к последовательности.
 *
 * Отражение открывает интересные возможности, но передает всю проверку типов на стадию выполнения,
 * что нежелательно во многих ситуациях. Если проверку типов можно обеспечить на стадии компиляции,
 * обычно этот вариант более желателен. Но возможно ли совместить проверку типов во время компиляции
 * с латентной типизацией?
 */
public class Apply {
    public static <T, S extends Iterable<? extends T>> void apply(S seq, Method method, Object... args) {
        try {
            for (T t : seq)
                method.invoke(t, args);
        } catch (Exception e) {
            // Сбои являются ошибками программиста
            throw new RuntimeException(e);
        }
    }
}

class Shape {
    public void rotate() { System.out.println(this + " rotate"); }
    public void resize(int newSize) { System.out.println(this + " resize " + newSize); }
}

class Square extends Shapes {}

class FilledList<T> extends ArrayList<T> {
    public FilledList(Class<? extends T> type, int size) {
        try {
            for (int i = 0; i < size; i++) {
                // Предполагается конструктор по умолячанию:
                add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class ApplyText {
    public static void main(String[] args) throws Exception {
        List<Shape> shapes = new ArrayList<Shape>();
        for (int i = 0; i < 10; i++) {
            shapes.add(new Shape());
        }
        Apply.apply(shapes, Shape.class.getMethod("rotate"));
        Apply.apply(shapes, Shape.class.getMethod("resize", int.class), 5);


        List<Square> squares = new ArrayList<Square>();
        for (int i = 0; i < 10; i++) {
            squares.add(new Square());
        }
        Apply.apply(squares, Square.class.getMethod("rotate"));
        Apply.apply(squares, Square.class.getMethod("resize", int.class), 5);


        Apply.apply(new FilledList<Shape>(Shape.class, 10), Shape.class.getMethod("rotate"));
        Apply.apply(new FilledList<Square>(Square.class, 10), Square.class.getMethod("rotate"));


//        SimpleQueue<Shape> shapeQ = new SimpleQueue<Shape>();
//        for (int i = 0; i < 5; i++) {
//            shapeQ.add(new Shape());
//            //shapeQ.add(new Square());
//        }
//        Apply.apply(shapeQ, Shape.class.getMethod("rotate"));

    }
}
