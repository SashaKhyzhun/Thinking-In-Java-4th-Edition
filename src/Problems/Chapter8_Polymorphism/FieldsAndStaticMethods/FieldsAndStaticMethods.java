package Problems.Chapter8_Polymorphism.FieldsAndStaticMethods;

/**
 * Created by SashaKhyzhun on 12/12/16.
 * Пример восходящего преобразования.
 *
 * Если возникнут вопросы: страница 248.
 */

// прямое обращение к полю разрешается во время компиляции.

class Super {
    public int field = 0;
    public int getField() { return field; }
}

class Sub extends Super {
    public int field = 1;
    public int getField() { return field; }
    public int getSuperField() { return super.getField(); }
}

class FieldsAndStaticMethods {

    public static void main(String[] args) {

        Super _super = new Sub(); // Upcast
        System.out.println("sup.field = "      + _super.field
                       + ", sup.getField() = " + _super.getField());

        Sub subclass = new Sub();
        System.out.println("sub.field = "           + subclass.field
                       + ", sub.getField() = "      + subclass.getField()
                       + ", sub.getSuperField() = " + subclass.getSuperField());
    }

}

