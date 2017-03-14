package Problems.Chapter15_Generics.m_Limitations;

import java.awt.*;

/**
 * @author SashaKhyzhun on 3/14/17. Page 545.
 * Так как стирание удаляет инфомрацию типа, для неограничиваемых параметров
 * обобщений можно вызывать только медоты, доступные для Object. Но при ограничении
 * параметра подмножеством типов вы сможете вызывать методы этого подмножества.
 *
 * Важно понимать, что в контексте обобщений extends
 * имеет совершенно иной смысл, чем обычно.
 */

interface HasColor { java.awt.Color getColor(); }

class Colored<T extends HasColor> {
    T item;
    Colored(T item) { this.item = item; }
    T getItem() { return item; }
    // Ограничение позволяет вызывать метод:
    java.awt.Color color() {
        return item.getColor();
    }
}

class Dimension { public int x, y, z; }

// не работает -- сначала должен быть указан класс, затем интерфейс:
//class ColoredDimension<T extends HasColor & Dimension> {}

// Множественные ограничения:
class ColoredDimension<T extends Dimension & HasColor> {
    T item;
    ColoredDimension(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    java.awt.Color color() {
        return item.getColor();
    }
    int getX() { return item.x; }
    int getY() { return item.y; }
    int getZ() { return item.z; }
}

interface Weight { int weight(); }

// Как и в случае с наследованием, можно указать только 1
// конкретный класс, но несколько интерфейсов:
class Solid<T extends Dimension & HasColor & Weight> {
    T item;
    public Solid(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    java.awt.Color color() {
        return item.getColor();
    }
    int getX() { return item.x; }
    int getY() { return item.y; }
    int getZ() { return item.z; }
    int weight() { return item.weight(); }
}

class Bounded extends Dimension implements HasColor, Weight {
    @Override public Color getColor() { return null; }
    @Override public int weight() { return 0; }
}
public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
        solid.color();
        solid.getX();
        solid.weight();
    }
}
