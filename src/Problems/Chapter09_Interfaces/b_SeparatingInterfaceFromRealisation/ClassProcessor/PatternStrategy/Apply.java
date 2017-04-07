package Problems.Chapter09_Interfaces.b_SeparatingInterfaceFromRealisation.ClassProcessor.PatternStrategy;

import java.util.Arrays;

/**
 * Created by SashaKhyzhun on 1/9/17.
 */

// Отделение интерфейса от реализации.

/** Решение, при котором поведение метода изменяется в зависимости от
    переданного объекта-аргумента, называется паттерном "Стратегия". */


class Processor {
    String name() {
        return getClass().getSimpleName();
    }
    Object process(Object input) {
        return input;
    }
}
class Uppercase extends Processor {
    // между базовым и производным классом вызывается производный =\
    String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
class Downcase extends Processor {
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
class Splitter extends Processor {
    // Аргумент split() используется для разбиения строки
    String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
class SwagLeet extends Processor {
    String process(Object input) {
        return ((String)input)
                .replace("e", "3")
                .replace("i", "1")
                .replace("o", "0")
                .replace("t", "7")
                .replace("a", "4");
    }
}

public class Apply {

    private static String s = "Disagreement with beliefs is by definition incorrect";

    private static void process(Processor p, Object text) {
        System.out.println("Используем Processor " + p.name());
        System.out.println(p.process(text));
    }

    public static void main(String[] args) {
        process(new Uppercase(),s);
        process(new Downcase(), s);
        process(new Splitter(), s);
        process(new SwagLeet(), s);
    }

}
