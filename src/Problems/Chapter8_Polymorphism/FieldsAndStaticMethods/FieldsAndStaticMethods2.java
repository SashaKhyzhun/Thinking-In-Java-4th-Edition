package Problems.Chapter8_Polymorphism.FieldsAndStaticMethods;

/**
 * Created by SashaKhyzhun on 1/4/17.
 */


/*
 * Статические методы не поддерживают полиморфного поведения
 * Super - Базовая версия
 * Sub   - Производная
 */


class StaticSuper {
    public static String staticGet() {
        return "Super version of staticGet()";
    }
    public String dynamicGet() {
        return "Super version of dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Sub version of staticGet()";
    }
    public String dynamicGet() {
        return "Sub version of dynamicGet()";
    }
}

public class FieldsAndStaticMethods2 {

    public static void main(String[] args) {
        StaticSuper sup = new StaticSub(); // Восходящее преобразование
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }

}
